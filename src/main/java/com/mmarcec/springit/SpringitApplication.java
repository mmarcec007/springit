package com.mmarcec.springit;

import com.mmarcec.springit.domain.Comment;
import com.mmarcec.springit.domain.Link;
import com.mmarcec.springit.repository.CommentRepository;
import com.mmarcec.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit!");
    }

    //@Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
              Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2-docs");
              linkRepository.save(link);

              Comment comment = new Comment("This Spring Boot 2 link is awsome!", link);
              commentRepository.save(comment);
              link.addComment(comment);
        };
    }
}


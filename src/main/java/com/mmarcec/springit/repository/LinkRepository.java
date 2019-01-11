package com.mmarcec.springit.repository;

import com.mmarcec.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {

}

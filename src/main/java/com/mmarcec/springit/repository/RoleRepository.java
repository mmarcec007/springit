package com.mmarcec.springit.repository;

import com.mmarcec.springit.domain.Role;
import com.mmarcec.springit.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

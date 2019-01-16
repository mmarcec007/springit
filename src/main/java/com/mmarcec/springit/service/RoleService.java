package com.mmarcec.springit.service;

import com.mmarcec.springit.domain.Role;
import com.mmarcec.springit.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        return  roleRepository.findByName(name);
    }

}

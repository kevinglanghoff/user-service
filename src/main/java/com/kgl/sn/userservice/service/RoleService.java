package com.kgl.sn.userservice.service;

import com.kgl.sn.userservice.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kgl.sn.userservice.model.Role;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role getRoleById(Long roleId){
        Role role = roleRepository.findById(roleId).get();
        return role;
    }
}

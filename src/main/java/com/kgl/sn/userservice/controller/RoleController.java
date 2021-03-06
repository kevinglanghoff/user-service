package com.kgl.sn.userservice.controller;

import com.kgl.sn.userservice.model.Role;
import com.kgl.sn.userservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @GetMapping("/getRoleById/{id}")
    public Role getRoleById(@PathVariable("id") String id){
        long l = Long.parseLong(id);

        Role role = roleService.getRoleById(l);
        return role;
    }
}

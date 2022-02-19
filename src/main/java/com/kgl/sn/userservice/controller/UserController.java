package com.kgl.sn.userservice.controller;

import com.kgl.sn.userservice.model.Role;
import com.kgl.sn.userservice.model.User;
import com.kgl.sn.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") String id){
        long l = Long.parseLong(id);

        User user = userService.getUserById(l);
        return user;
    }
}

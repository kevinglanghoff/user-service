package com.kgl.sn.userservice.service;

import com.kgl.sn.userservice.model.Role;
import com.kgl.sn.userservice.model.User;
import com.kgl.sn.userservice.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long userId){
        User user = userRepository.findById(userId).get();

        return user;
    }
}

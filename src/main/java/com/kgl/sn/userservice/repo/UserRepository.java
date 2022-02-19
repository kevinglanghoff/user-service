package com.kgl.sn.userservice.repo;

import com.kgl.sn.userservice.model.Role;
import com.kgl.sn.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

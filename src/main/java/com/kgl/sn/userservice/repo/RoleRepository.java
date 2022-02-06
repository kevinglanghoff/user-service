package com.kgl.sn.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kgl.sn.userservice.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

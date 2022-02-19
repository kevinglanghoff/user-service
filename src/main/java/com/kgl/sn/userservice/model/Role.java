package com.kgl.sn.userservice.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

  private long role_id;
  private String roleName;
  private String role_cd;
  private Set<Permission> permissions = new HashSet<Permission>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    @Column(name="rolename", unique=true, nullable=false, length=50)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String rolename) {
        this.roleName = rolename;
    }

    @Column(name="role_cd", unique=true, nullable=false, length=50)
    public String getRole_cd() {
        return role_cd;
    }

    public void setRole_cd(String role_cd) {
        this.role_cd = role_cd;
    }

    // a role has permissions
    @OneToMany
    @JoinTable(
            name="role_permission",
            joinColumns = @JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name="perm_id")
    )
    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}

package com.kgl.sn.userservice.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "\"user\"") // had to escape here because sql server has a user as a keyword
// could rename the user table if needed
public class User {

    private long user_id;
    private String userName;
    private String password;
    private Set<Role> roles = new HashSet<Role>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Column(name="username", unique=true, nullable=false, length=50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name="password", unique=true, nullable=false, length=50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // a user has roles
    @OneToMany
    @JoinTable(
            name="user_role",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

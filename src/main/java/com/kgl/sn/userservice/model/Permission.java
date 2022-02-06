package com.kgl.sn.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {

    private long perm_id;
    private String permname;
    private String perm_cd;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perm_id")
    public long getPerm_id() {
        return perm_id;
    }

    public void setPerm_id(long perm_id) {
        this.perm_id = perm_id;
    }

    @Column(name="permname", unique=true, nullable=false, length=50)
    public String getPermname() {
        return permname;
    }

    public void setPermname(String permname) {
        this.permname = permname;
    }

    @Column(name="perm_cd", unique=true, nullable=false, length=50)
    public String getPerm_cd() {
        return perm_cd;
    }

    public void setPerm_cd(String perm_cd) {
        this.perm_cd = perm_cd;
    }
}

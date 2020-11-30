package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * AdminUser generated by hbm2java
 */
@Entity(name="admin_user")
public class AdminUser  implements java.io.Serializable {


     private int id;
     private String username;
     private String password;
     private byte active;

    public AdminUser() {
    }

    public AdminUser(int id, String username, String password, byte active) {
       this.id = id;
       this.username = username;
       this.password = password;
       this.active = active;
    }
   
     @Id 
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, nullable=false)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", unique=true, nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }




}



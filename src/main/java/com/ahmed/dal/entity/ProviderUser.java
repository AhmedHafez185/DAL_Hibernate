package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ProviderUser generated by hbm2java
 */
@Entity(name="provider_user")
public class ProviderUser  implements java.io.Serializable {


     private int id;
     private Branch branch;
     private Provider provider;
     private String username;
     private String password;
     private Byte active;

    public ProviderUser() {
    }

	
    public ProviderUser(int id, Provider provider, String username, String password) {
        this.id = id;
        this.provider = provider;
        this.username = username;
        this.password = password;
    }
    public ProviderUser(Provider provider, String username, String password) {
        this.provider = provider;
        this.username = username;
        this.password = password;
    }
    public ProviderUser(int id, Branch branch, Provider provider, String username, String password, Byte active) {
       this.id = id;
       this.branch = branch;
       this.provider = provider;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="branch_id")
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="provider_id", nullable=false)
    public Provider getProvider() {
        return this.provider;
    }
    
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    
    @Column(name="username", unique=true, nullable=false, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="active")
    public Byte getActive() {
        return this.active;
    }
    
    public void setActive(Byte active) {
        this.active = active;
    }




}



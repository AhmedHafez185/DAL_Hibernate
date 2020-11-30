package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Provider generated by hbm2java
 */
@Entity(name="provider")
public class Provider  implements java.io.Serializable {


     private int id;
     private String nameAr;
     private String nameEn;
     private String hotline;
     private String logoPathAr;
     private String logoPathEn;
     private Set<Category> categories = new HashSet<Category>(0);
     private Set<Branch> branches = new HashSet<Branch>(0);
     private Set<ProviderUser> providerUsers = new HashSet<ProviderUser>(0);

    public Provider() {
    }

	
    public Provider(int id, String nameAr, String nameEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    public Provider(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    public Provider(int id, String nameAr, String nameEn, String hotline, String logoPathAr, String logoPathEn, Set<Category> categories, Set<Branch> branches, Set<ProviderUser> providerUsers) {
       this.id = id;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.hotline = hotline;
       this.logoPathAr = logoPathAr;
       this.logoPathEn = logoPathEn;
       this.categories = categories;
       this.branches = branches;
       this.providerUsers = providerUsers;
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

    
    @Column(name="name_ar", unique=true, nullable=false)
    public String getNameAr() {
        return this.nameAr;
    }
    
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    
    @Column(name="name_en", unique=true, nullable=false)
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    
    @Column(name="hotline", length=20)
    public String getHotline() {
        return this.hotline;
    }
    
    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    
    @Column(name="logo_path_ar")
    public String getLogoPathAr() {
        return this.logoPathAr;
    }
    
    public void setLogoPathAr(String logoPathAr) {
        this.logoPathAr = logoPathAr;
    }

    
    @Column(name="logo_path_en")
    public String getLogoPathEn() {
        return this.logoPathEn;
    }
    
    public void setLogoPathEn(String logoPathEn) {
        this.logoPathEn = logoPathEn;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="provider")
    public Set<Category> getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="provider")
    public Set<Branch> getBranches() {
        return this.branches;
    }
    
    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="provider")
    public Set<ProviderUser> getProviderUsers() {
        return this.providerUsers;
    }
    
    public void setProviderUsers(Set<ProviderUser> providerUsers) {
        this.providerUsers = providerUsers;
    }




}


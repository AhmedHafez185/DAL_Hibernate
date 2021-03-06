package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
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
 * City generated by hbm2java
 */
@Entity(name = "city")
public class City  implements java.io.Serializable {


     private int id;
     private String nameAr;
     private String nameEn;
     private Set<Area> areas = new HashSet<Area>(0);

    public City() {
    }

	
    public City(int id, String nameAr, String nameEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    public City( String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }
    
    public City(int id, String nameAr, String nameEn, Set<Area> areas) {
       this.id = id;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.areas = areas;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="city",cascade = CascadeType.ALL)
    public Set<Area> getAreas() {
        return this.areas;
    }
    
    public void setAreas(Set<Area> areas) {
        this.areas = areas;
    }




}



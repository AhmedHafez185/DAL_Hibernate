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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity(name="product")
public class Product  implements java.io.Serializable {


     private int id;
     private Category category;
     private String nameAr;
     private String nameEn;
     private String descriptionAr;
     private String descriptionEn;
     private float price;
     private byte active;
     private String imgPath;
     private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

    public Product() {
    }

public Product(Category category, String nameAr, String nameEn, float price, byte active) {
        this.category = category;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.price = price;
        this.active = active;
    }	
    public Product(int id, Category category, String nameAr, String nameEn, float price, byte active) {
        this.id = id;
        this.category = category;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.price = price;
        this.active = active;
    }
    public Product(int id, Category category, String nameAr, String nameEn, String descriptionAr, String descriptionEn, float price, byte active, String imgPath, Set<OrderItem> orderItems) {
       this.id = id;
       this.category = category;
       this.nameAr = nameAr;
       this.nameEn = nameEn;
       this.descriptionAr = descriptionAr;
       this.descriptionEn = descriptionEn;
       this.price = price;
       this.active = active;
       this.imgPath = imgPath;
       this.orderItems = orderItems;
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
    @JoinColumn(name="category_id", nullable=false)
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    
    @Column(name="name_ar", nullable=false)
    public String getNameAr() {
        return this.nameAr;
    }
    
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    
    @Column(name="name_en", nullable=false)
    public String getNameEn() {
        return this.nameEn;
    }
    
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    
    @Column(name="description_ar", length=65535)
    public String getDescriptionAr() {
        return this.descriptionAr;
    }
    
    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    
    @Column(name="description_en", length=65535)
    public String getDescriptionEn() {
        return this.descriptionEn;
    }
    
    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    
    @Column(name="price", nullable=false, precision=12, scale=0)
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }

    
    @Column(name="img_path")
    public String getImgPath() {
        return this.imgPath;
    }
    
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderItem> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }




}


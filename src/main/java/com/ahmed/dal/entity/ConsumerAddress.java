package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * ConsumerAddress generated by hbm2java
 */
@Entity(name="consumer_address")
public class ConsumerAddress  implements java.io.Serializable {


     private int id;
     private Area area;
     private Consumer consumer;
     private String street;
     private String building;
     private String floor;
     private String flat;
     private String landMark;
     private BigDecimal lat;
     private BigDecimal lng;
     private byte active;
     private String label;
     private Set<Order> orders = new HashSet<Order>(0);

    public ConsumerAddress() {
    }

	
    public ConsumerAddress(int id, Area area, Consumer consumer, String street, String building, String floor, String flat, byte active) {
        this.id = id;
        this.area = area;
        this.consumer = consumer;
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.flat = flat;
        this.active = active;
    }
    public ConsumerAddress(int id, Area area, Consumer consumer, String street, String building, String floor, String flat, String landMark, BigDecimal lat, BigDecimal lng, byte active, String label, Set<Order> orders) {
       this.id = id;
       this.area = area;
       this.consumer = consumer;
       this.street = street;
       this.building = building;
       this.floor = floor;
       this.flat = flat;
       this.landMark = landMark;
       this.lat = lat;
       this.lng = lng;
       this.active = active;
       this.label = label;
       this.orders = orders;
    }
    public ConsumerAddress(Area area, Consumer consumer, String street, String building, String floor, String flat, byte active) {
        this.area = area;
        this.consumer = consumer;
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.flat = flat;
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
    @JoinColumn(name="area_id", nullable=false)
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_id", nullable=false)
    public Consumer getConsumer() {
        return this.consumer;
    }
    
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    
    @Column(name="street", nullable=false, length=100)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="building", nullable=false, length=100)
    public String getBuilding() {
        return this.building;
    }
    
    public void setBuilding(String building) {
        this.building = building;
    }

    
    @Column(name="floor", nullable=false, length=45)
    public String getFloor() {
        return this.floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    @Column(name="flat", nullable=false, length=100)
    public String getFlat() {
        return this.flat;
    }
    
    public void setFlat(String flat) {
        this.flat = flat;
    }

    
    @Column(name="land_mark")
    public String getLandMark() {
        return this.landMark;
    }
    
    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    
    @Column(name="lat", precision=10, scale=8)
    public BigDecimal getLat() {
        return this.lat;
    }
    
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    
    @Column(name="lng", precision=11, scale=8)
    public BigDecimal getLng() {
        return this.lng;
    }
    
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }

    
    @Column(name="label", length=100)
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consumerAddress")
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }




}



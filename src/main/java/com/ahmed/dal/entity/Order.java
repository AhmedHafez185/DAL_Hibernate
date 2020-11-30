package com.ahmed.dal.entity;
// Generated May 26, 2020 10:25:03 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity(name="order")
public class Order  implements java.io.Serializable {


     private int id;
     private Area area;
     private Branch branch;
     private Consumer consumer;
     private ConsumerAddress consumerAddress;
     private Date orderedAt;
     private float deliveryFees;
     private String status;
     private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

    public Order() {
    }

	
    public Order(int id, Area area, Branch branch, Consumer consumer, Date orderedAt, float deliveryFees, String status) {
        this.id = id;
        this.area = area;
        this.branch = branch;
        this.consumer = consumer;
        this.orderedAt = orderedAt;
        this.deliveryFees = deliveryFees;
        this.status = status;
    }
    public Order(Area area, Branch branch, Consumer consumer, Date orderedAt, float deliveryFees, String status) {
        this.area = area;
        this.branch = branch;
        this.consumer = consumer;
        this.orderedAt = orderedAt;
        this.deliveryFees = deliveryFees;
        this.status = status;
    }
    public Order(int id, Area area, Branch branch, Consumer consumer, ConsumerAddress consumerAddress, Date orderedAt, float deliveryFees, String status, Set<OrderItem> orderItems) {
       this.id = id;
       this.area = area;
       this.branch = branch;
       this.consumer = consumer;
       this.consumerAddress = consumerAddress;
       this.orderedAt = orderedAt;
       this.deliveryFees = deliveryFees;
       this.status = status;
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
    @JoinColumn(name="area_id", nullable=false)
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="branch_id", nullable=false)
    public Branch getBranch() {
        return this.branch;
    }
    
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_id", nullable=false)
    public Consumer getConsumer() {
        return this.consumer;
    }
    
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_address_id")
    public ConsumerAddress getConsumerAddress() {
        return this.consumerAddress;
    }
    
    public void setConsumerAddress(ConsumerAddress consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ordered_at", nullable=false, length=19)
    public Date getOrderedAt() {
        return this.orderedAt;
    }
    
    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    
    @Column(name="delivery_fees", nullable=false, precision=12, scale=0)
    public float getDeliveryFees() {
        return this.deliveryFees;
    }
    
    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    
    @Column(name="status", nullable=false, length=100)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderItem> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }




}



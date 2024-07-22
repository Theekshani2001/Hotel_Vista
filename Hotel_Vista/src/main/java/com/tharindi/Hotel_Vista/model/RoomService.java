package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class RoomService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private Date orderDate;
    private String orderStatus;
    private Double salary;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room room;

    public RoomService() {
    }

    public RoomService(Long id, Date orderDate, String orderStatus, Double salary, User user, Room room) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.salary = salary;
        this.user = user;
        this.room = room;
    }

    public RoomService(Date orderDate, String orderStatus, Double salary, User user, Room room) {
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.salary = salary;
        this.user = user;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "RoomService{" +
                "orderId=" + id +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", salary=" + salary +
                ", user=" + user +
                ", room=" + room +
                '}';
    }
}

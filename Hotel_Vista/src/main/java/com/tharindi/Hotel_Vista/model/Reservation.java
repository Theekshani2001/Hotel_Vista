package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkInDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date checkOutDate;
    private Integer numOfAdults;
    private Integer numOfChildren;
    private Double totalCost;
    private String reservationStatus; //Confirmed, Pending, Cancelled

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room room;

    public Reservation(Long id, Date checkInDate, Date checkOutDate, Integer numOfAdults, Integer numOfChildren, Double totalCost, String reservationStatus, User user, Room room) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.totalCost = totalCost;
        this.reservationStatus = reservationStatus;
        this.user = user;
        this.room= room;
    }

    public Reservation(Date checkInDate, Date checkOutDate, Integer numOfAdults, Integer numOfChildren, Double totalCost, String reservationStatus, User user, Room room) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
        this.totalCost = totalCost;
        this.reservationStatus = reservationStatus;
        this.user = user;
        this.room= room;
    }

    public Reservation() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(Integer numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public Integer getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(Integer numOfChildren) {
        this.numOfChildren = numOfChildren;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user= user;
    }

    public Room getRoomId() {
        return room;
    }

    public void setRoomId(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + id +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", numOfAdults=" + numOfAdults +
                ", numOfChildren=" + numOfChildren +
                ", totalCost=" + totalCost +
                ", reservationStatus='" + reservationStatus + '\'' +
                ", userId=" + user +
                ", roomId=" + room +
                '}';
    }
}

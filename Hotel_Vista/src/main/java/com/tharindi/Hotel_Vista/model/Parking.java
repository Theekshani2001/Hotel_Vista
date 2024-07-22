package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String vehicleNumber;
    private String parkingStartTime;
    private String parkingEndTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Parking() {
    }

    public Parking(Long id, String vehicleNumber, String parkingStartTime, String parkingEndTime, User user) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.parkingStartTime = parkingStartTime;
        this.parkingEndTime = parkingEndTime;
        this.user = user;
    }

    public Parking(String vehicleNumber, String parkingStartTime, String parkingEndTime, User user) {
        this.vehicleNumber = vehicleNumber;
        this.parkingStartTime = parkingStartTime;
        this.parkingEndTime = parkingEndTime;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long parkingId) {
        this.id = parkingId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getParkingStartTime() {
        return parkingStartTime;
    }

    public void setParkingStartTime(String parkingStartTime) {
        this.parkingStartTime = parkingStartTime;
    }

    public String getParkingEndTime() {
        return parkingEndTime;
    }

    public void setParkingEndTime(String parkingEndTime) {
        this.parkingEndTime = parkingEndTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parkingId=" + id +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", parkingStartTime='" + parkingStartTime + '\'' +
                ", parkingEndTime='" + parkingEndTime + '\'' +
                ", user=" + user +
                '}';
    }
}

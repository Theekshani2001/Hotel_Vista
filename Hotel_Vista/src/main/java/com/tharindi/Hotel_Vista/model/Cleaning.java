package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Cleaning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private Date cleaningDate;
    private String cleaningStatus;//Clean, Dirty, InProgress

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "room_id")
    private Room room;

    public Cleaning() {
    }

    public Cleaning(Date cleaningDate, String cleaningStatus, Room room) {
        this.cleaningDate = cleaningDate;
        this.cleaningStatus = cleaningStatus;
        this.room = room;
    }

    public Cleaning(Long id, Date cleaningDate, String cleaningStatus, Room room) {
        this.id = id;
        this.cleaningDate = cleaningDate;
        this.cleaningStatus = cleaningStatus;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long cleaningId) {
        this.id = cleaningId;
    }

    public Date getCleaningDate() {
        return cleaningDate;
    }

    public void setCleaningDate(Date cleaningDate) {
        this.cleaningDate = cleaningDate;
    }

    public String getCleaningStatus() {
        return cleaningStatus;
    }

    public void setCleaningStatus(String cleaningStatus) {
        this.cleaningStatus = cleaningStatus;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Cleaning{" +
                "cleaningId=" + id +
                ", cleaningDate=" + cleaningDate +
                ", cleaningStatus='" + cleaningStatus + '\'' +
                ", room=" + room +
                '}';
    }
}

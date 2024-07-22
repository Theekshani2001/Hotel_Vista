package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class BuffetTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;

    private Date issueDate;
    private String ticketType;
    private Double price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;


    public BuffetTicket(Long ticketId, Date issueDate, String ticketType, Double price, User user) {
        this.id = ticketId;
        this.issueDate = issueDate;
        this.ticketType = ticketType;
        this.price = price;
        this.user = user;
    }

    public BuffetTicket(Date issueDate, String ticketType, Double price, User user) {
        this.issueDate = issueDate;
        this.ticketType = ticketType;
        this.price = price;
        this.user = user;
    }

    public BuffetTicket() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long ticketId) {
        this.id = ticketId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BuffetTicket{" +
                "ticketId=" + id +
                ", issueDate=" + issueDate +
                ", ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", user=" + user +
                '}';
    }
}

package com.example.demo.entity;

import java.time.LocalDate;

public class NotificationLog {
    private long id;
    private Broadcast broadcast;
    private String recipientEmail;
    private LocalDate sentOn;
    private String status;
    public NotificationLog(){
        
    }
    public NotificationLog(Broadcast broadcast, String recipientEmail, LocalDate sentOn, String status) {
        this.broadcast = broadcast;
        this.recipientEmail = recipientEmail;
        this.sentOn = sentOn;
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Broadcast getBroadcast() {
        return broadcast;
    }
    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }
    public String getRecipientEmail() {
        return recipientEmail;
    }
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }
    public LocalDate getSentOn() {
        return sentOn;
    }
    public void setSentOn(LocalDate sentOn) {
        this.sentOn = sentOn;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}

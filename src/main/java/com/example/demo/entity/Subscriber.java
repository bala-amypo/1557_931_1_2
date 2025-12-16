package com.example.demo.entity;

import java.time.LocalDate;

public class Subscriber {
    private long id;
    private String name;
    private String email;
    private String preferredCategories;
    private String preferredLocations;
    private LocalDate subscribedOn;
    public Subscriber(){
        
    }
    public Subscriber(String name, String email, String preferredCategories, String preferredLocations,
            LocalDate subscribedOn) {
        this.name = name;
        this.email = email;
        this.preferredCategories = preferredCategories;
        this.preferredLocations = preferredLocations;
        this.subscribedOn = subscribedOn;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPreferredCategories() {
        return preferredCategories;
    }
    public String getPreferredLocations() {
        return preferredLocations;
    }
    public LocalDate getSubscribedOn() {
        return subscribedOn;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPreferredCategories(String preferredCategories) {
        this.preferredCategories = preferredCategories;
    }
    public void setPreferredLocations(String preferredLocations) {
        this.preferredLocations = preferredLocations;
    }
    public void setSubscribedOn(LocalDate subscribedOn) {
        this.subscribedOn = subscribedOn;
    }
    
}

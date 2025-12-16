package com.example.demo.entity;

import java.time.LocalDate;

public class Event {
    private long id;
    private String title;
    private String description;
    private String category;
    private LocalDate startTime;
    private LocalDate endTime;
    private User organizer;
    private LocalDate createdOn;
    private boolean isPublic;
    public Event(){
        
    }
    public Event(String title, String description, String category, LocalDate startTime, LocalDate endTime,
            User organizer, LocalDate createdOn, boolean isPublic) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.startTime = startTime;
        this.endTime = endTime;
        this.organizer = organizer;
        this.createdOn = createdOn;
        this.isPublic = isPublic;
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public LocalDate getStartTime() {
        return startTime;
    }
    public LocalDate getEndTime() {
        return endTime;
    }
    public User getOrganizer() {
        return organizer;
    }
    public LocalDate getCreatedOn() {
        return createdOn;
    }
    public boolean isPublic() {
        return isPublic;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }
    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }
    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    
}

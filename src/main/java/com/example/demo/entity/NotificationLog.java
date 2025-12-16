package com.example.demo.entity;

import java.time.LocalDate;

public class NotificationLog {
    private long id;
    private Broadcast broadcast;
    private String recipientEmail;
    private LocalDate sentOn;
    private String status;
}

package com.example.trykafka3.model;

public class EmailMessage {
    private String destinationEmailAddress;
    private String subject;
    private String message;

    public EmailMessage(String destinationEmailAddress, String subject, String message) {
        this.destinationEmailAddress = destinationEmailAddress;
        this.subject = subject;
        this.message = message;
    }


    public String getDestinationEmailAddress() {
        return destinationEmailAddress;
    }

    public void setDestinationEmailAddress(String destinationEmailAddress) {
        this.destinationEmailAddress = destinationEmailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

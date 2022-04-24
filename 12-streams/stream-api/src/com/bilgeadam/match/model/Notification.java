package com.bilgeadam.match.model;

public class Notification {

    public Notification(Priority priority, String type, String message){
        this.priority = priority;
        this.type = type;
        this.message = message;
    }

    private Priority priority;
    private String type;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}

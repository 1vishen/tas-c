package com.tas_c;

public class Task {
    private static int idCount = 1;
    private final int id;
    private String description;
    private String status;

    public Task(String description) {
        this.id = idCount++;
        setDescription(description);
        this.status = "pending";
    }

    //getters
    public int getTaskId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    //setters
    public void setDescription(String description) {
        if (description != null && !description.isEmpty()) {
            this.description = description;
        } else {
            System.out.println("error: description can't be empty!");
        }
    }

    public void setStatus(String status) {
        if (status != null && !status.isEmpty()) {
            if (status.equalsIgnoreCase("pending") || status.equalsIgnoreCase("completed")) {
                this.status = status.toLowerCase();
            } else {
                System.out.println("error: status can only have 2 values, pending/completed");
            }
        } else {
            System.out.println("error : status cannot have empty value");
        }
    }

    //for easy printing
    @Override
    public String toString() {
        return "task details : " + " id: " + id + " description: " + description + " status: " + status;
    }
}

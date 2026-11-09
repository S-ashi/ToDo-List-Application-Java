package com.todo;

public class Task {
	
	private int taskId;
    private String title;
    private String status;

    // Constructor
    public Task(int taskId, String title, String status) {
        this.taskId = taskId;
        this.title = title;
        this.status = status;
    }

    // Getter and Setter for taskId
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display task details
    public void displayTask() {

        System.out.println("Task ID: " + taskId);
        System.out.println("Title: " + title);
        System.out.println("Status: " + status);
        System.out.println("------------------------");
    }
}



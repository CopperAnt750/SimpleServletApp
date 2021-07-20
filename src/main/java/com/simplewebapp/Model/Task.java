package com.simplewebapp.Model;

import com.simplewebapp.Priority;

public class Task {
    private int id;
    private String taskName;
//    private Priority priority;
    private String priority;

    private static int counter = 1;

    public Task() {
        this.id = counter++;
    }

    public Task(String taskName, String priority) {
        this.id = counter++;
        this.taskName = taskName;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    /* public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }*/

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Task.counter = counter;
    }
}

package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int priority;
    private boolean done;
    private String due_date;

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String v) { this.title = v; }
    public int getPriority() { return priority; }
    public void setPriority(int v) { this.priority = v; }
    public boolean getDone() { return done; }
    public void setDone(boolean v) { this.done = v; }
    public String getDueDate() { return due_date; }
    public void setDueDate(String v) { this.due_date = v; }
}

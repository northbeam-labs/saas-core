package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kind;
    private String message;
    private boolean read;

    public Long getId() { return id; }
    public String getKind() { return kind; }
    public void setKind(String v) { this.kind = v; }
    public String getMessage() { return message; }
    public void setMessage(String v) { this.message = v; }
    public boolean getRead() { return read; }
    public void setRead(boolean v) { this.read = v; }
}

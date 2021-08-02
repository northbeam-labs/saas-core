package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String full_name;
    private boolean is_active;
    private String hashed_password;

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public void setEmail(String v) { this.email = v; }
    public String getFullName() { return full_name; }
    public void setFullName(String v) { this.full_name = v; }
    public boolean getIsActive() { return is_active; }
    public void setIsActive(boolean v) { this.is_active = v; }
    public String getHashedPassword() { return hashed_password; }
    public void setHashedPassword(String v) { this.hashed_password = v; }
}

package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "organizations")
public class Organization {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String slug;
    private String plan;
    private int seats;

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String v) { this.name = v; }
    public String getSlug() { return slug; }
    public void setSlug(String v) { this.slug = v; }
    public String getPlan() { return plan; }
    public void setPlan(String v) { this.plan = v; }
    public int getSeats() { return seats; }
    public void setSeats(int v) { this.seats = v; }
}

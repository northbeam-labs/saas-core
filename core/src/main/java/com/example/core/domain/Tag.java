package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class Tag {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private String color;

    public Long getId() { return id; }
    public String getLabel() { return label; }
    public void setLabel(String v) { this.label = v; }
    public String getColor() { return color; }
    public void setColor(String v) { this.color = v; }
}
// TODO clean this

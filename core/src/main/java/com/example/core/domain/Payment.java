package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String provider;
    private String status;
    private String reference;

    public Long getId() { return id; }
    public double getAmount() { return amount; }
    public void setAmount(double v) { this.amount = v; }
    public String getProvider() { return provider; }
    public void setProvider(String v) { this.provider = v; }
    public String getStatus() { return status; }
    public void setStatus(String v) { this.status = v; }
    public String getReference() { return reference; }
    public void setReference(String v) { this.reference = v; }
}

package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private double amount;
    private String currency;
    private boolean paid;

    public Long getId() { return id; }
    public String getNumber() { return number; }
    public void setNumber(String v) { this.number = v; }
    public double getAmount() { return amount; }
    public void setAmount(double v) { this.amount = v; }
    public String getCurrency() { return currency; }
    public void setCurrency(String v) { this.currency = v; }
    public boolean getPaid() { return paid; }
    public void setPaid(boolean v) { this.paid = v; }
}

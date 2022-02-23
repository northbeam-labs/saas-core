package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "api_keys")
public class ApiKey {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String prefix;
    private boolean revoked;

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String v) { this.name = v; }
    public String getPrefix() { return prefix; }
    public void setPrefix(String v) { this.prefix = v; }
    public boolean getRevoked() { return revoked; }
    public void setRevoked(boolean v) { this.revoked = v; }
}

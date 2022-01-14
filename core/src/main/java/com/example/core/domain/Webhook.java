package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "webhooks")
public class Webhook {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String event;
    private boolean active;
    private String secret;

    public Long getId() { return id; }
    public String getUrl() { return url; }
    public void setUrl(String v) { this.url = v; }
    public String getEvent() { return event; }
    public void setEvent(String v) { this.event = v; }
    public boolean getActive() { return active; }
    public void setActive(boolean v) { this.active = v; }
    public String getSecret() { return secret; }
    public void setSecret(String v) { this.secret = v; }
}

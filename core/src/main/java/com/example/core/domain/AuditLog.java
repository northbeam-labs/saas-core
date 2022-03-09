package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "audit_logs")
public class AuditLog {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private int actor_id;
    private String target;

    public Long getId() { return id; }
    public String getAction() { return action; }
    public void setAction(String v) { this.action = v; }
    public int getActorId() { return actor_id; }
    public void setActorId(int v) { this.actor_id = v; }
    public String getTarget() { return target; }
    public void setTarget(String v) { this.target = v; }
}

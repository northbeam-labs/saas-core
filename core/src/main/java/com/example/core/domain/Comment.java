package com.example.core.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private int author_id;
    private boolean edited;

    public Long getId() { return id; }
    public String getBody() { return body; }
    public void setBody(String v) { this.body = v; }
    public int getAuthorId() { return author_id; }
    public void setAuthorId(int v) { this.author_id = v; }
    public boolean getEdited() { return edited; }
    public void setEdited(boolean v) { this.edited = v; }
}

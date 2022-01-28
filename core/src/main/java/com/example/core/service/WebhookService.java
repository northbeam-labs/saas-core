package com.example.core.service;

import com.example.core.domain.Webhook;
import com.example.core.repo.WebhookRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WebhookService {
    private final WebhookRepository repo;
    public WebhookService(WebhookRepository repo) { this.repo = repo; }
    public List<Webhook> all() { return repo.findAll(); }
    public Webhook get(Long id) { return repo.findById(id).orElseThrow(); }
    public Webhook save(Webhook e) { return repo.save(e); }
}

package com.example.core.web;

import com.example.core.domain.Webhook;
import com.example.core.service.WebhookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/webhooks")
public class WebhookController {
    private final WebhookService service;
    public WebhookController(WebhookService service) { this.service = service; }
    @GetMapping public List<Webhook> all() { return service.all(); }
    @GetMapping("/{id}") public Webhook get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Webhook create(@RequestBody Webhook e) { return service.save(e); }
}

package com.example.core.web;

import com.example.core.domain.Notification;
import com.example.core.service.NotificationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService service;
    public NotificationController(NotificationService service) { this.service = service; }
    @GetMapping public List<Notification> all() { return service.all(); }
    @GetMapping("/{id}") public Notification get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Notification create(@RequestBody Notification e) { return service.save(e); }
}

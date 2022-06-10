package com.example.core.web;

import com.example.core.domain.AuditLog;
import com.example.core.service.AuditLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/audit_logs")
public class AuditLogController {
    private final AuditLogService service;
    public AuditLogController(AuditLogService service) { this.service = service; }
    @GetMapping public List<AuditLog> all() { return service.all(); }
    @GetMapping("/{id}") public AuditLog get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public AuditLog create(@RequestBody AuditLog e) { return service.save(e); }
}
// revisit later

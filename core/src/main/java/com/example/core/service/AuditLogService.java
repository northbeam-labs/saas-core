package com.example.core.service;

import com.example.core.domain.AuditLog;
import com.example.core.repo.AuditLogRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AuditLogService {
    private final AuditLogRepository repo;
    public AuditLogService(AuditLogRepository repo) { this.repo = repo; }
    public List<AuditLog> all() { return repo.findAll(); }
    public AuditLog get(Long id) { return repo.findById(id).orElseThrow(); }
    public AuditLog save(AuditLog e) { return repo.save(e); }
}

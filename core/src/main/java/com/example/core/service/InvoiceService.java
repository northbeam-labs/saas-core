package com.example.core.service;

import com.example.core.domain.Invoice;
import com.example.core.repo.InvoiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository repo;
    public InvoiceService(InvoiceRepository repo) { this.repo = repo; }
    public List<Invoice> all() { return repo.findAll(); }
    public Invoice get(Long id) { return repo.findById(id).orElseThrow(); }
    public Invoice save(Invoice e) { return repo.save(e); }
}

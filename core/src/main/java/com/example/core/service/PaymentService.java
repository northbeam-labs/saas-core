package com.example.core.service;

import com.example.core.domain.Payment;
import com.example.core.repo.PaymentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository repo;
    public PaymentService(PaymentRepository repo) { this.repo = repo; }
    public List<Payment> all() { return repo.findAll(); }
    public Payment get(Long id) { return repo.findById(id).orElseThrow(); }
    public Payment save(Payment e) { return repo.save(e); }
}

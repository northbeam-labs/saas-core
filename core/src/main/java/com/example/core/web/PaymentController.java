package com.example.core.web;

import com.example.core.domain.Payment;
import com.example.core.service.PaymentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;
    public PaymentController(PaymentService service) { this.service = service; }
    @GetMapping public List<Payment> all() { return service.all(); }
    @GetMapping("/{id}") public Payment get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Payment create(@RequestBody Payment e) { return service.save(e); }
}
// off-by-one, fixed

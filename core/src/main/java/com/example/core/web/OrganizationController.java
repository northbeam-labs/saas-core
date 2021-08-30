package com.example.core.web;

import com.example.core.domain.Organization;
import com.example.core.service.OrganizationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
    private final OrganizationService service;
    public OrganizationController(OrganizationService service) { this.service = service; }
    @GetMapping public List<Organization> all() { return service.all(); }
    @GetMapping("/{id}") public Organization get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Organization create(@RequestBody Organization e) { return service.save(e); }
}

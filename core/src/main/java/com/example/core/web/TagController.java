package com.example.core.web;

import com.example.core.domain.Tag;
import com.example.core.service.TagService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tags")
public class TagController {
    private final TagService service;
    public TagController(TagService service) { this.service = service; }
    @GetMapping public List<Tag> all() { return service.all(); }
    @GetMapping("/{id}") public Tag get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Tag create(@RequestBody Tag e) { return service.save(e); }
}

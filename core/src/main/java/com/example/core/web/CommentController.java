package com.example.core.web;

import com.example.core.domain.Comment;
import com.example.core.service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;
    public CommentController(CommentService service) { this.service = service; }
    @GetMapping public List<Comment> all() { return service.all(); }
    @GetMapping("/{id}") public Comment get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Comment create(@RequestBody Comment e) { return service.save(e); }
}
// revisit later

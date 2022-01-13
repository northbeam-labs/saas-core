package com.example.core.web;

import com.example.core.domain.Project;
import com.example.core.service.ProjectService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService service;
    public ProjectController(ProjectService service) { this.service = service; }
    @GetMapping public List<Project> all() { return service.all(); }
    @GetMapping("/{id}") public Project get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Project create(@RequestBody Project e) { return service.save(e); }
}
// tidy up

package com.example.core.web;

import com.example.core.domain.Task;
import com.example.core.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;
    public TaskController(TaskService service) { this.service = service; }
    @GetMapping public List<Task> all() { return service.all(); }
    @GetMapping("/{id}") public Task get(@PathVariable Long id) { return service.get(id); }
    @PostMapping public Task create(@RequestBody Task e) { return service.save(e); }
}
// left a note for myself
// off-by-one, fixed

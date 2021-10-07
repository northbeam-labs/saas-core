package com.example.core.service;

import com.example.core.domain.Task;
import com.example.core.repo.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repo;
    public TaskService(TaskRepository repo) { this.repo = repo; }
    public List<Task> all() { return repo.findAll(); }
    public Task get(Long id) { return repo.findById(id).orElseThrow(); }
    public Task save(Task e) { return repo.save(e); }
}

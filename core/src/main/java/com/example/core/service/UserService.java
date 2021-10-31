package com.example.core.service;

import com.example.core.domain.User;
import com.example.core.repo.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }
    public List<User> all() { return repo.findAll(); }
    public User get(Long id) { return repo.findById(id).orElseThrow(); }
    public User save(User e) { return repo.save(e); }
}
// left a note for myself

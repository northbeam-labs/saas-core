package com.example.core.service;

import com.example.core.domain.Tag;
import com.example.core.repo.TagRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TagService {
    private final TagRepository repo;
    public TagService(TagRepository repo) { this.repo = repo; }
    public List<Tag> all() { return repo.findAll(); }
    public Tag get(Long id) { return repo.findById(id).orElseThrow(); }
    public Tag save(Tag e) { return repo.save(e); }
}
// check perf here

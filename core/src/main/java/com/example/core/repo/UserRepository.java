package com.example.core.repo;

import com.example.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
// TODO clean this
// revisit later

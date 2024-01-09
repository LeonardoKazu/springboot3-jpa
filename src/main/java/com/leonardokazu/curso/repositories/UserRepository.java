package com.leonardokazu.curso.repositories;

import com.leonardokazu.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

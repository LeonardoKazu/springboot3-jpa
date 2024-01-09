package com.leonardokazu.curso.repositories;

import com.leonardokazu.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

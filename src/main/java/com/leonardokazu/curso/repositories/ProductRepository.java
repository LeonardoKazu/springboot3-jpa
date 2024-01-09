package com.leonardokazu.curso.repositories;

import com.leonardokazu.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.leonardokazu.curso.repositories;


import com.leonardokazu.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

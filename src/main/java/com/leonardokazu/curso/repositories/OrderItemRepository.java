package com.leonardokazu.curso.repositories;

import com.leonardokazu.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

package com.leonardokazu.curso.services;

import com.leonardokazu.curso.entities.Order;
import com.leonardokazu.curso.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public Order findById(Long id){
        return orderRepository.findById(id).get();
    }
}

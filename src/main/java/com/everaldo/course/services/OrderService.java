package com.everaldo.course.services;

import com.everaldo.course.entities.Order;
import com.everaldo.course.repositories.OrderRepository;
import com.everaldo.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    //Dependência para o repository
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }


}

package com.everaldo.course.resources;

import com.everaldo.course.entities.Order;
import com.everaldo.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired // ← Injeção de dependência
    private OrderService service;

    //O @GetMapping é uma anotação do Spring MVC para mapear requisições HTTP GET a métodos específicos do controller.
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){

        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}

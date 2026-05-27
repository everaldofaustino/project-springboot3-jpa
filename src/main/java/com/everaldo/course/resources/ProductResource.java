package com.everaldo.course.resources;

import com.everaldo.course.entities.Product;
import com.everaldo.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired // ← Injeção de dependência
    private ProductService service;

    //O @GetMapping é uma anotação do Spring MVC para mapear requisições HTTP GET a métodos específicos do controller.
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){

        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}

package com.everaldo.course.resources;

import com.everaldo.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //O @GetMapping é uma anotação do Spring MVC para mapear requisições HTTP GET a métodos específicos do controller.
    @GetMapping
    public ResponseEntity<User> findAll(){

        User u = new User(1L,"Maria","maria@gmail.com","99999999","12345");
        return ResponseEntity.ok().body(u);


    }

}

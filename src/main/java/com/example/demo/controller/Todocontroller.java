package com.example.demo.controller;


import com.example.demo.models.Todo;
import com.example.demo.services.Todoservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class Todocontroller {

    @Autowired
private Todoservices todoservices;
//    create todo

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        return todoservices.create(todo) ;
    }


    @GetMapping
//    get all todo
    public List<Todo> getAll(){
        return todoservices.getList();
    }

}

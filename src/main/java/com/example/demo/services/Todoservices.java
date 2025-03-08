package com.example.demo.services;

import com.example.demo.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Todoservices {
    private List<Todo> list = new ArrayList<>();

    public Todo create(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getList() {
        return list;
    }
}

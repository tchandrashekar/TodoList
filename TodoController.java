package com.example.Todo.Controller;

import com.example.Todo.Model.Todo;
import com.example.Todo.Service.TodoService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*")
public class TodoController {
     private final TodoService service;
     
     public TodoController(TodoService service) {
        this.service = service;
    }
     
      @GetMapping
    public List<Todo> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return service.addTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTodo(id);
    }
    
}

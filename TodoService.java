package com.example.Todo.Service;

import com.example.Todo.Model.Todo;
import com.example.Todo.repository.Todorepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    
    private final Todorepository repo;
    
    public TodoService(Todorepository repo) {
        this.repo = repo;
    }
    
    public List<Todo> getAll() {
        return repo.findAll();
    }

    public Todo addTodo(Todo todo) {
        return repo.save(todo);
    }

    public void deleteTodo(Long id) {
        repo.deleteById(id);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        return repo.findById(id).map(todo -> {
            todo.setTask(updatedTodo.getTask());
            todo.setCompleted(updatedTodo.isCompleted());
            return repo.save(todo);
        }).orElse(null);
    }
}

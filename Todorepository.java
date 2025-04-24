/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Todo.repository;

import com.example.Todo.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tanne
 */
public interface Todorepository extends JpaRepository<Todo, Long> {
    
}

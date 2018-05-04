package com.springbootjpa.repository;


import com.springbootjpa.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo , Long>{
}

package com.vamsi.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vamsi.ToDoList.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}

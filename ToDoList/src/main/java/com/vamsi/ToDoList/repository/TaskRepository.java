package com.vamsi.ToDoList.repository;

import com.vamsi.ToDoList.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long>{

}

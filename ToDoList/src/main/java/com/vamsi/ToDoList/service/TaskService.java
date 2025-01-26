package com.vamsi.ToDoList.service;

import com.vamsi.ToDoList.entity.Task;
import com.vamsi.ToDoList.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    public final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Long id,Task taskDetails){
        Task task = taskRepository.findById(id).orElse(null);
        if(task!=null){
            task.setTitle(taskDetails.getTitle());
            task.setDescription(taskDetails.getDescription());
            task.setCompleted(taskDetails.getCompleted());
            task.setDueDate(taskDetails.getDueDate());
            return taskRepository.save(task);
        }
        return null;
    }
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}

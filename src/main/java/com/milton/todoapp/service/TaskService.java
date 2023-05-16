package com.milton.todoapp.service;


import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.repository.TaskRepository;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;


//en esta clase se crea la logica necesaria para desarrollar la finalidad el proyecto

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task createTask(TaskInDTO  taskindto){
this.repository.save(taskindto);


        return
    }
}

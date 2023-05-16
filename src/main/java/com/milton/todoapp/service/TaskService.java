package com.milton.todoapp.service;


import com.milton.todoapp.mapper.TaskInDTOToTask;
import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.repository.TaskRepository;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;


//en esta clase se crea la logica necesaria para desarrollar la finalidad el proyecto
// en este caso

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskindto) {
        Task task = mapper.map(taskindto);
          return this.repository.save(task);
    }
}

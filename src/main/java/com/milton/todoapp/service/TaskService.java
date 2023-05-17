package com.milton.todoapp.service;


import com.milton.todoapp.exceptions.ToDoExceptions;
import com.milton.todoapp.mapper.TaskInDTOToTask;
import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.entity.TaskStatus;
import com.milton.todoapp.persistence.repository.TaskRepository;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


//en esta clase se crea la logica necesaria para desarrollar la finalidad el proyecto
// en este caso .ook

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

    public List<Task> findAll() {
        return this.repository.findAll();
    }

    public List<Task> findAllByEstado(TaskStatus status) {
        return this.repository.findAllByEstado(status);
    }

    @Transactional
    public void updateTaskFinich(Long id) {

        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions("tarea no funcionando correctamente", HttpStatus.NOT_FOUND);
        }
        this.repository.marktTaskAsFinished(id);
    }

    @Transactional
    public void deleteById(Long id) {

        Optional<Task> optionalTask = this.repository.findById(id);
        if (optionalTask.isEmpty()) {
            throw new ToDoExceptions("tarea no funcionando correctamente", HttpStatus.NOT_FOUND);
        }
        this.repository.deleteById(id);
    }

}



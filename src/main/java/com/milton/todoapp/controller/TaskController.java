package com.milton.todoapp.controller;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.service.TaskService;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks") //esta notacion define el camino al controlador
public class TaskController {

    private final TaskService taskService;

    public  TaskController(TaskService taskService){
        this.taskService = taskService;
    }


    @PostMapping     //permite crear elementos
    public Task createTask(@RequestBody TaskInDTO taskInDTO){
        return this.taskService.createTask(taskInDTO);
    }
}

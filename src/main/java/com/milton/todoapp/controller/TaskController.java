package com.milton.todoapp.controller;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.entity.TaskStatus;
import com.milton.todoapp.service.TaskService;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<Task> findAll(){
        return this.taskService.findAll();
    }

    @GetMapping("/status/{status}")

    //(@PathVariable("status") TaskStatus status) en esa linea estamos indicando que vamos a leer una variable
    //llamada status de tipo TaskStatus
    //el valor que ingrese el usuario al hacer la consulta sera el valor que forzaremos a que sea de tipo taskstatus
    public List<Task> findAllEstado(@PathVariable("status") TaskStatus status){
        return this.taskService.findAllByEstado(status); //llamamos al metodo de la clase TaskServices que no permite hacer ese proceso
        //le pasamos la variable status que ingreso el cliente para mandarla al metodo y hacer la busqueda

    }



}

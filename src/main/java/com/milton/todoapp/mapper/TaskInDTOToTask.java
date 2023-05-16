package com.milton.todoapp.mapper;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.entity.TaskStatus;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//Esta clase convierte un taskindto en un Task crea un  elemento de entrada a un elemento de salida
//El usuario solo agrega 3 datos titulo,descripcion y fechaestimada el mapper crea los dos objetos
//crea la tarea del usuario con 3 datos y crea la tarea en general con los demas datos
@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{
    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitulo(in.getTitulo());
        task.setDescripcion(in.getDescripcion());
        task.setFechaestimada(in.getFechaestimada());
        task.setFechacreacion(LocalDateTime.now());
        task.setFinalizada(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return null;
    }
}

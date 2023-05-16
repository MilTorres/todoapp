package com.milton.todoapp.service.dto;

import com.milton.todoapp.persistence.entity.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaestimada;

}

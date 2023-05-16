package com.milton.todoapp.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data // crea la clase de lommbo que habilita los get and set sin nececidad de escribirlos
@Entity //hacemos referencia a que esta clase es una entidad de base de datos
@Table(name = "task") // crea la tabla en el SGBD H2 llamada task
public class Task {
    @Id // con esta notacion marcamos que tendremos una campo llamada id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // crea el id auto incrementable

    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechacreacion;
    private LocalDateTime fechaestimada;
    private boolean finalizada;
    private TaskStatus estado;
}
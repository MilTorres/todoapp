package com.milton.todoapp.persistence.repository;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {



    public List<Task> findAllByEstado(TaskStatus status); //se conecta a la base de datos y obtiene_todo lo que contiene status
}

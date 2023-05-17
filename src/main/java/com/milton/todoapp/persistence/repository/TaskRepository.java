package com.milton.todoapp.persistence.repository;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.persistence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {


    public List<Task> findAllByEstado(TaskStatus status); //se conecta a la base de datos y obtiene_todo lo que contiene status


    @Modifying //hace notacion a que es una query de actualizacion
    @Query(value = "UPDATE task SET finalizada = 'TRUE' WHERE id = :id", nativeQuery = true)
    //notacion que permite ejecutar query en spring
    public void marktTaskAsFinished(@Param("id") Long id);

}

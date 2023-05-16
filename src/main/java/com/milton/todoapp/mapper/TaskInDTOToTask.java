package com.milton.todoapp.mapper;

import com.milton.todoapp.persistence.entity.Task;
import com.milton.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

//Esta clase convierte un taskindto en un Task
@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{
    @Override
    public Task map(TaskInDTO in) {
        return null;
    }
}

package com.github.nishadnijam.springwebfluxtaskorganizerapi.service.impl;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import com.github.nishadnijam.springwebfluxtaskorganizerapi.service.TaskService;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Mono<Task> createTask(Task task) {
        throw new NotImplementedException("Create task not implemented");
    }

    @Override
    public Flux<Task> getAllTasks() {
        throw new NotImplementedException("Get all tasks not implemented");
    }

    @Override
    public Mono<Task> getTaskById(Long taskId) {
        throw new NotImplementedException("Get task by id not implemented");
    }

    @Override
    public Mono<Task> updateTask(Long taskId, Task updatedTask) {
        throw new NotImplementedException("update task by id not implemented");
    }

    @Override
    public Mono<Void> deleteTask(Long taskId) {
        throw new NotImplementedException("Delete task by id not implemented");
    }
}

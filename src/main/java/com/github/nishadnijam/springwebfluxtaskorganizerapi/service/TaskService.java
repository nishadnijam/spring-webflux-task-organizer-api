package com.github.nishadnijam.springwebfluxtaskorganizerapi.service;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TaskService {
    Mono<Task> createTask(Task task);

    Flux<Task> getAllTasks();

    Mono<Task> getTaskById(Long taskId);

    Mono<Task> updateTask(Long taskId, Task updatedTask);

    Mono<Void> deleteTask(Long taskId);

    Mono<Task> completeTaskById(Long taskId);
}

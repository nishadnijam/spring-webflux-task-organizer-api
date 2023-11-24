package com.github.nishadnijam.springwebfluxtaskorganizerapi.service.impl;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.exception.TaskNotFoundException;
import com.github.nishadnijam.springwebfluxtaskorganizerapi.repository.TaskRepository;
import com.github.nishadnijam.springwebfluxtaskorganizerapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Mono<Task> createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Flux<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Mono<Task> getTaskById(Long taskId) {
        return taskRepository.findById(taskId)
                .switchIfEmpty(Mono.error(new TaskNotFoundException(taskId)));
    }

    @Override
    public Mono<Task> updateTask(Long taskId, Task updatedTask) {
        return getTaskById(taskId)
                .map(Task::copyTask)
                .flatMap(copiedTask -> {
                    copiedTask.setTitle(updatedTask.getTitle());
                    copiedTask.setDescription(updatedTask.getDescription());
                    copiedTask.setCategory(updatedTask.getCategory());
                    copiedTask.setDueDate(updatedTask.getDueDate());
                    copiedTask.setCompleted(updatedTask.isCompleted());
                    return taskRepository.save(copiedTask);
                });
    }

    @Override
    public Mono<Void> deleteTask(Long taskId) {
        return taskRepository.deleteById(taskId);
    }

    @Override
    public Mono<Task> completeTaskById(Long taskId) {
        return getTaskById(taskId)
                .flatMap(task -> {
                    task.setCompleted(true);
                    return taskRepository.save(task);
                });
    }
}

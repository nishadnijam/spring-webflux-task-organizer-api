package com.github.nishadnijam.springwebfluxtaskorganizerapi.controller;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import com.github.nishadnijam.springwebfluxtaskorganizerapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1/tasks")
public class TaskController {

  @Autowired private TaskService taskService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<Task> createTask(@RequestBody Task task) {
    return taskService.createTask(task);
  }

  @GetMapping
  public Flux<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  @GetMapping("/{taskId}")
  public Mono<Task> getTaskById(@PathVariable Long taskId) {
    return taskService.getTaskById(taskId);
  }

  @PutMapping("/{taskId}")
  public Mono<Task> updateTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
    return taskService.updateTask(taskId, updatedTask);
  }

  @DeleteMapping("/{taskId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public Mono<Void> deleteTask(@PathVariable Long taskId) {
    return taskService.deleteTask(taskId);
  }
}

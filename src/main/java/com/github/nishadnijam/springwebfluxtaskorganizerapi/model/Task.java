package com.github.nishadnijam.springwebfluxtaskorganizerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task")
public class Task {

  @Id private Long id;
  private String title;
  private String description;
  private String category;
  private LocalDateTime dueDate;
  private boolean completed;

  public static Task copyTask(Task sourceTask) {
    Task targetTask = new Task();
    BeanUtils.copyProperties(sourceTask, targetTask);
    return targetTask;
  }

  public static Task from(
      String title,
      String description,
      String category,
      LocalDateTime dueDate,
      boolean isCompleted) {
    Task task = new Task();
    task.setTitle(title);
    task.setDescription(description);
    task.setCategory(category);
    task.setDueDate(dueDate);
    task.setCompleted(isCompleted);
    return task;
  }
}

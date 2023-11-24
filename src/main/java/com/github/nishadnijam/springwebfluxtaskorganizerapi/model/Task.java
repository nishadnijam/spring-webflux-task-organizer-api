package com.github.nishadnijam.springwebfluxtaskorganizerapi.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(name = "task")
public class Task {

    @Id
    private Long id;
    private String title;
    private String description;
    private String category;
    private LocalDateTime dueDate;
    private boolean completed;
}

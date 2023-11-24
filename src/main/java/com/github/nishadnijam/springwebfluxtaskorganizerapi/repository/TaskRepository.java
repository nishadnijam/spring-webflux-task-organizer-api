package com.github.nishadnijam.springwebfluxtaskorganizerapi.repository;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends R2dbcRepository<Task, Long> {}

package com.github.nishadnijam.springwebfluxtaskorganizerapi.repository;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.model.Task;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends ReactiveCrudRepository<Task, Long> {
}

package com.cts.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

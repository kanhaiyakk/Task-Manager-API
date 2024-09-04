package com.cts.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.taskmanager.model.Task;
import com.cts.taskmanager.model.TaskStatus;
import com.cts.taskmanager.repository.TaskRepository;

public interface TaskService {

	 public List<Task> getAllTasks();
	 public Task getTaskById(Long id);
	 public Task saveTask(Task task);
	 public void deleteTask(Long id);
	 public List<Task> getTasksByStatus(TaskStatus status);
	 public Task updateTaskStatus(Long taskId, TaskStatus newStatus);
}

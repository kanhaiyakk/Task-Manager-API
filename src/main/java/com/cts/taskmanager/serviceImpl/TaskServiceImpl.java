package com.cts.taskmanager.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.taskmanager.model.Task;
import com.cts.taskmanager.model.TaskStatus;
import com.cts.taskmanager.repository.TaskRepository;
import com.cts.taskmanager.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
		
	}

	@Override
	public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);

	}

	@Override
	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public void deleteTask(Long id) {
		 taskRepository.deleteById(id);
		
	}

	@Override
	public List<Task> getTasksByStatus(TaskStatus status) {
		 return taskRepository.findAll()
	                .stream()
	                .filter(task -> task.getStatus() == status)
	                .collect(Collectors.toList());
	}

	@Override
	public Task updateTaskStatus(Long taskId, TaskStatus newStatus) {
		  Task task = getTaskById(taskId);
	        if (task != null) {
	            task.setStatus(newStatus);
	            return taskRepository.save(task);
	}
	        return null;
}
}

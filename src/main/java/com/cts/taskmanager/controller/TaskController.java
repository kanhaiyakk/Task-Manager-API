package com.cts.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.taskmanager.model.Task;
import com.cts.taskmanager.model.TaskStatus;
import com.cts.taskmanager.service.TaskService;



@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	 @GetMapping
	    public List<Task> getAllTasks() {
	        return taskService.getAllTasks();
	    }
	 @GetMapping("/{id}")
	    public Task getTaskById(@PathVariable Long id) {
	        return taskService.getTaskById(id);
	    }
	 @GetMapping("/status/{status}")
	    public List<Task> getTasksByStatus(@PathVariable TaskStatus status) {
	        return taskService.getTasksByStatus(status);
	    }
	 @PostMapping
	    public Task createTask(@RequestBody Task task) {
	        return taskService.saveTask(task);
	    }
	 
	 @PutMapping("/{id}/status")
	    public Task updateTaskStatus(@PathVariable Long id, @RequestParam TaskStatus status) {
	        return taskService.updateTaskStatus(id, status);
	    }
	 
	 @DeleteMapping("/{id}")
	    public void deleteTask(@PathVariable Long id) {
	        taskService.deleteTask(id);
	    }
	
	
}

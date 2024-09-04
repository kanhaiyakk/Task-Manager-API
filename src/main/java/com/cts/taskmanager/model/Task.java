package com.cts.taskmanager.model;

import java.time.LocalDateTime;

import jakarta.persistence.EnumType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String title;

	 private String description;

	 private LocalDateTime dueDate;
	 
	  @jakarta.persistence.Enumerated(EnumType.STRING)
	    private TaskStatus status;
	 
}

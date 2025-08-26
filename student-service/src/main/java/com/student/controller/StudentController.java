package com.student.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@PostMapping
	public ResponseEntity<Student> create(@Valid @RequestBody Student s) {
		return null;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> get(@PathVariable Long id) {
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id, @Valid @RequestBody Student s) {
		return null;
	}
}

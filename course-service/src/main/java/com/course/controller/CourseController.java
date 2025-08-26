package com.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.dto.CourseResponse;
import com.course.entity.Course;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@PostMapping
	public ResponseEntity<Course> create(@Valid @RequestBody Course c) {
		return null;
	}

	@GetMapping("/{id}")
	public ResponseEntity<CourseResponse> get(@PathVariable Long id) {
		return null;
	}

	@PutMapping("/{id}")
	public ResponseEntity<Course> update(@PathVariable Long id, @Valid @RequestBody Course c) {
		return null;
	}
}

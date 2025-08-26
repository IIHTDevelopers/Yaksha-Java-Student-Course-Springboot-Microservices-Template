package com.student.entity;

public class Student {

	private Long id;

	private String name;

	private String email;

	private String program;

	public Student() {
	}

	public Student(Long id, String name, String email, String program) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.program = program;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
}

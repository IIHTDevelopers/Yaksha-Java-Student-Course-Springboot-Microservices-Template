package com.course.entity;

public class Course {

	private Long id;

	private String name;

	private String code;

	private Long studentId;

	public Course() {
	}

	public Course(Long id, String name, String code, Long studentId) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.studentId = studentId;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}

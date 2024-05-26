package com.jspiders.studentsystem.service;

import java.util.List;

import com.jspiders.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();

}

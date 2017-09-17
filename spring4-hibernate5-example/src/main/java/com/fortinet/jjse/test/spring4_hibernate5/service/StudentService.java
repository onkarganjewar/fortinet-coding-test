package com.fortinet.jjse.test.spring4_hibernate5.service;

import java.util.List;

import com.fortinet.jjse.test.spring4_hibernate5.model.Student;

public interface StudentService {
	public void add(Student student);

	public List<Student> listAllStudents();

	public Student getStudentById(int id);

	public Student getStudentByEmail(String email);

}

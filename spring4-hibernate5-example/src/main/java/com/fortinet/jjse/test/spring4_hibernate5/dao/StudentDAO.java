package com.fortinet.jjse.test.spring4_hibernate5.dao;

import java.util.List;

import com.fortinet.jjse.test.spring4_hibernate5.model.Student;

public interface StudentDAO {
	public void add(Student student);

	public List<Student> listAllStudents ();
}

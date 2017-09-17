package com.fortinet.jjse.test.spring4_hibernate5.service;

import java.util.ArrayList;
import java.util.List;

import com.fortinet.jjse.test.spring4_hibernate5.dao.StudentDAO;
import com.fortinet.jjse.test.spring4_hibernate5.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDao;

	@Override
	@Transactional
	public void add(Student student) {
		studentDao.add(student);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Student> listAllStudents() {
		return studentDao.listAllStudents();
	}

	@Transactional(readOnly = true)
	@Override
	public Student getStudentById(int i) {
		List<Student> list = studentDao.listAllStudents();
		for (Student s : list) {
			if (s.getId().equals(i)) {
				return s;
			}
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Student getStudentByEmail(String email) {
		List<Student> list = studentDao.listAllStudents();
		for (Student s : list) {
			if (s.getEmail().equals(email)) {
				return s;
			}
		}
		return null;
	}
}

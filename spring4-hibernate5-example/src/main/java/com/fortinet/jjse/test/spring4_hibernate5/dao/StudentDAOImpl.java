package com.fortinet.jjse.test.spring4_hibernate5.dao;

import java.util.List;
import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fortinet.jjse.test.spring4_hibernate5.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void add(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	public List<Student> listAllStudents() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		TypedQuery<Student> query = sessionFactory.getCurrentSession().createQuery("from Student");
		return query.getResultList();
	}

}

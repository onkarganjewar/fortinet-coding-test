package com.fortinet.jjse.test.spring4_hibernate5;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import com.fortinet.jjse.test.spring4_hibernate5.config.AppConfig;
import com.fortinet.jjse.test.spring4_hibernate5.model.Student;
import com.fortinet.jjse.test.spring4_hibernate5.service.StudentService;

/**
 * Unit test for simple student app.
 * 
 * @author Onkar
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class }, loader = AnnotationConfigContextLoader.class)
@Transactional
public class AppTest {
	@Resource
	private StudentService studentService;
	private static final String FIRST_NAME = "john";
	private static final String LAST_NAME = "branston";
	private static final String EMAIL = "john@example.com";

	@Test
	public void testAddStudent() {
		int studentsBefore = studentService.listAllStudents().size();
		Student student = new Student(FIRST_NAME, LAST_NAME, EMAIL);
		studentService.add(student);
		int studentsAfter = studentService.listAllStudents().size();
		assertEquals("student creation unsuccessfull", ++studentsBefore, studentsAfter);
	}

	@Test
	public void testRetrieveStudent() {
		Student student = studentService.getStudentByEmail(EMAIL);
		assertEquals("name incorrect", FIRST_NAME, student.getFirstName());
	}
}

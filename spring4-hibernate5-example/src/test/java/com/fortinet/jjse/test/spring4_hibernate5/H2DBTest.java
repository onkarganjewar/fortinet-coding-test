package com.fortinet.jjse.test.spring4_hibernate5;

import com.fortinet.jjse.test.spring4_hibernate5.config.H2DBConfig;
import com.fortinet.jjse.test.spring4_hibernate5.model.Student;
import com.fortinet.jjse.test.spring4_hibernate5.service.StudentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { H2DBConfig.class }, loader = AnnotationConfigContextLoader.class)
@Transactional
public class H2DBTest {

	@Resource
	private StudentService studentService;
	private static final String FIRST_NAME = "bryan";
	private static final String LAST_NAME = "cranston";
	private static final String EMAIL = "bryan@example.com";

	@Test
	public void testCreateRetrieveStudent() {
		Student student = new Student(FIRST_NAME, LAST_NAME, EMAIL);
		studentService.add(student);

		Student s1 = studentService.getStudentByEmail(EMAIL);
		assertEquals("name incorrect", FIRST_NAME, s1.getFirstName());
	}
}

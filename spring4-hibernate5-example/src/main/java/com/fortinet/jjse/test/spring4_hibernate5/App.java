package com.fortinet.jjse.test.spring4_hibernate5;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fortinet.jjse.test.spring4_hibernate5.config.AppConfig;
import com.fortinet.jjse.test.spring4_hibernate5.model.Student;
import com.fortinet.jjse.test.spring4_hibernate5.service.StudentService;

/**
 * @author Onkar
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService studentService = context.getBean(StudentService.class);

		// Add Students
		studentService.add(new Student("Onkar", "Ganjewar", "onkar.ganjewar@example.com"));
		studentService.add(new Student("Rick", "Grimes", "rick.grimes@example.com"));
		studentService.add(new Student("Daryl", "Dixon", "daryl.dixon@example.com"));

		// Get Students
		List<Student> students = studentService.listAllStudents();
		for (Student student : students) {
			System.out.println("Id = " + student.getId());
			System.out.println("First Name = " + student.getFirstName());
			System.out.println("Last Name = " + student.getLastName());
			System.out.println("Email = " + student.getEmail());
			System.out.println();
		}

		context.close();
	}
}

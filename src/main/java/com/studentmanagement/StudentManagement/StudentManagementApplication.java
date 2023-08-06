package com.studentmanagement.StudentManagement;

import com.studentmanagement.StudentManagement.Entity.Student;
import com.studentmanagement.StudentManagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Theara","Sambath","Theara@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("pev","lev","Pev@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("pev","lev","Pev@gmail.com");
//		studentRepository.save(student3);
	}
}

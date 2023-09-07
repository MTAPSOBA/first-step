package com.taps.student.DAL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.taps.student.DAL.entities.Student;
import com.taps.student.DAL.repo.StudentRepositry;

@SpringBootTest
class StudentdalApplicationTests {
	@Autowired
	private StudentRepositry repo;

	
	@Test
	void testCreateStudent() {
	
		Student student = new Student();
		student.setName("john");
		student.setCourse("Serverless using AWS");
		student.setFee(300d);		
		repo.save(student);
	}
	@Test
	void tesFindStudentById() {
		Student student = repo.findById(1l).get();
		
		System.out.println(student);
		
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setFee(400d);
		repo.save(student);

	}
     @Test
	void testDelete() {
 		Student student = repo.findById(1l).get();
 		repo.delete(student);

		
	}
	
	
	
}


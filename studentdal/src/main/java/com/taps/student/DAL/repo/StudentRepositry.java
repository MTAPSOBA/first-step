package com.taps.student.DAL.repo;

import org.springframework.data.repository.CrudRepository;

import com.taps.student.DAL.entities.Student;

public interface StudentRepositry extends CrudRepository<Student, Long> {

}

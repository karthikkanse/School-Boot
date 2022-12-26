package com.ty.school.school_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.school.school_boot.dto.Student;
import com.ty.school.school_boot.jparepository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository repository;
	
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public Student getStudent(int id) {
		
		return repository.findById(id).get();
	}
	public String deleteStudent(int id) {
		
		repository.deleteById(id);
		return "deleted";
	}
	
}

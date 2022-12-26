package com.ty.school.school_boot.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.school.school_boot.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	
	
}

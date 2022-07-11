package com.springboot.crud.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	

}

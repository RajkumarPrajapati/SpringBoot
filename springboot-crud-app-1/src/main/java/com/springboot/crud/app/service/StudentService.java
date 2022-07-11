package com.springboot.crud.app.service;

import java.util.List;

import com.springboot.crud.app.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> saveStudents(List<Student> students);

	public List<Student> getStudents();

	public Student getStudentById(int rollNo);

	public String deleteStudent(int rollNo);

	public Student updateStudent(Student student);

}

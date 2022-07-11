package com.springboot.crud.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.app.entity.Student;
import com.springboot.crud.app.repository.StudentRepository;
import com.springboot.crud.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public Student saveStudent(Student student) {
		return studentRepo.save(student);

	}

	public List<Student> saveStudents(List<Student> students) {
		return studentRepo.saveAll(students);
	}

	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public Student getStudentById(int rollNo) {
		return studentRepo.findById(rollNo).orElse(null);

	}

	public String deleteStudent(int rollNo) {
		studentRepo.deleteById(rollNo);
		return "student removed success " + rollNo;
	}

	public Student updateStudent(Student student) {
		System.out.println(student.toString());
			return studentRepo.save(student );
		

	}

}

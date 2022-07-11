package com.springboot.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.app.entity.Student;
import com.springboot.crud.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PostMapping("/addList")
	public List<Student> addStudents(@RequestBody List<Student> students) {
		return studentService.saveStudents(students);
	}
	
	@GetMapping("/getAll")
	public List<Student> findAllStudent(){
		return studentService.getStudents();
	}
	
	@GetMapping("/findById")
	public Student findStudentById(@RequestParam("rollNo") int rollNo) {
		return studentService.getStudentById(rollNo);
	}
	
	@PostMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("rollNo") int rollNo) {
		return studentService.deleteStudent(rollNo);
	}
	

}

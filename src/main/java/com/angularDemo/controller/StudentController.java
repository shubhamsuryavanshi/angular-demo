package com.angularDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularDemo.entity.Student;
import com.angularDemo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getAllStudents")
	public ResponseEntity<?> getAllStudents(){	
		return new ResponseEntity<Page<Student>>(studentService.getAllStudents(1),HttpStatus.OK);
	}
	
	@PostMapping("/submitStudent")
	public ResponseEntity<?> submitStundent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.submitStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable long id){
		Student std = new Student();
		std.setAddress("test");
		std.setAge(24);
		std.setCity("test");
		std.setEmailId("emaoil@mail.com");
		return std;
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student){
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable long id){
		
	}
	/*@GetMapping("/searchMr")
	public List<Mr>getMr(MrParams params){
		return studentService.getAllMr(params);
	}*/

}

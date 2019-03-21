package com.angularDemo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.angularDemo.entity.Mr;
import com.angularDemo.entity.Student;
import com.angularDemo.params.MrParams;

public interface StudentService {

	Student submitStudent(Student student);

	Page<Student> getAllStudents(int pageNo);
	
	List<Mr> getAllMr(MrParams param);

}

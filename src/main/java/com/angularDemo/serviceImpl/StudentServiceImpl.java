package com.angularDemo.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.angularDemo.entity.Mr;
import com.angularDemo.entity.Student;
import com.angularDemo.params.MrParams;
import com.angularDemo.repository.MrRepository;
import com.angularDemo.repository.StudentRepository;
import com.angularDemo.service.StudentService;
import com.angularDemo.specifications.MrSpecification;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	MrRepository mrRepository;
	
	@Override
	public Student submitStudent(Student student) {
		student.setCreateDate(new Date());
		return studentRepository.save(student);	
	}

	@Override
	public Page<Student> getAllStudents(int pageNo) {
		Pageable pagerquest = new PageRequest(pageNo - 1, 10);
		return studentRepository.findAll(pagerquest);
	}

	@Override
	public List<Mr> getAllMr(MrParams param) {
		Specification mr=new MrSpecification(param);
		return mrRepository.findAll(mr);// mrRepository.findByName(name);
	}

}

package com.angularDemo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.angularDemo.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>,JpaSpecificationExecutor<Student>{

	public Page<Student> findAll(Pageable pagerquest);
	
	public void deleteById(int id);
	
	public Student findById(int id);
}

package com.angularDemo.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.angularDemo.entity.Mr;

public interface MrRepository extends CrudRepository<Mr, Integer>,JpaSpecificationExecutor<Mr> {

	/*@Query("select m from Mr m where m.name like %:name%")
	List<Mr> findByName(@Param("name") String name);*/
	
	@Override
	public List<Mr> findAll(Specification<Mr> mr);
}

package com.angularDemo.specifications;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.angularDemo.entity.Student;
import com.angularDemo.params.MrParams;

public class MrSpecification implements Specification<Student> {
	
	private MrParams param;
	
	public MrSpecification(MrParams param){
		this.param = param;
	}

	@Override
	public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		List<Predicate> predicates = new ArrayList<>();
		if(param.getName() != null){
			predicates.add(cb.like(root.get("name"), "%"+param.getName()+"%"));	
		}
		if(param.getId()> 0){
			predicates.add(cb.equal(root.get("id"), param.getId()));	
		}
		
		return cb.and(predicates.toArray(new Predicate[predicates.size()]));
	}
	
	
}

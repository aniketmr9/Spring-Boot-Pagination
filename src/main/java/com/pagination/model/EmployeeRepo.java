package com.pagination.model;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Integer>{
	Page<Employee> findAll(Pageable pageable);

}

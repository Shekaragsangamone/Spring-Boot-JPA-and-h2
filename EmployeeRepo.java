package com.practice.firstwebjpa.doc;

import org.springframework.data.repository.CrudRepository;

import com.practice.firstwebjpa.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}

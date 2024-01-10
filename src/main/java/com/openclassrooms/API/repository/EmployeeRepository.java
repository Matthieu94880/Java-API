package com.openclassrooms.API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassrooms.API.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

package com.sapient.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.hibernate.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

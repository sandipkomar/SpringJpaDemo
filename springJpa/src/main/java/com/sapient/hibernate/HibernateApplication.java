package com.sapient.hibernate;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sapient.hibernate.model.Employee;
import com.sapient.hibernate.repository.EmployeeRepository;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(HibernateApplication.class);
	
	@Autowired
	private EmployeeRepository employeeRespository;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee ee = new Employee();
		ee.setEmail("sandeep@gmail.com");
		ee.setFistName("sandeep");
		ee.setLastName("kumar");
		employeeRespository.save(ee);
		
		Optional<Employee> entity = employeeRespository.findById(4L);
		logger.info("Employee id 1 -> {}", entity.get());	
	}

}

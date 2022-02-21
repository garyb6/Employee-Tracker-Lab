package com.employeeTracker.employeeTracker;

import com.employeeTracker.employeeTracker.models.Employee;
import com.employeeTracker.employeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee ben = new Employee("Ben Stokes", 30, 55, "ben@stokes.com");
		employeeRepository.save(ben);
	}

}

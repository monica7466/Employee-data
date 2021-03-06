package com.cg.spring.boot.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.demo.exception.EmployeeNotFoundException;
import com.cg.spring.boot.demo.model.Employee;
import com.cg.spring.boot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeService.class);

	public Employee getEmployeeById(int eid) {
		LOG.info("getEmployee" + eid);
		Optional<Employee> optEmp = employeeRepository.findById(eid);
		if (optEmp.isEmpty())
			throw new EmployeeNotFoundException();
		else
			return optEmp.get();
	}

	public List<Employee> getEmployeeWithSalaryGreaterThan(double salary) {
		LOG.info("getEmployeeWithSalaryGreaterThan " + salary);
		List<Employee> empList = employeeRepository.findBySalaryGreaterThan(salary);
		if (empList.size() == 0) {
			LOG.error("Employee not found.");
			throw new EmployeeNotFoundException();
		} else
			return empList;
	}

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		LOG.info("addEmployee");
		try {
			return employeeRepository.save(employee);
		} catch (IllegalArgumentException iae) {
			LOG.error(iae.getMessage());
			return null;
		}
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info("updateEmployee");
		try {
			return employeeRepository.save(employee);
		} catch (IllegalArgumentException ex) {
			LOG.error(ex.getMessage());
			return null;
		}
	}

	public int deleteEmployee(int eid) {
		LOG.info("deleteEmployee");
		employeeRepository.deleteById(eid);
		return eid;
	}
}
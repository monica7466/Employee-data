package com.cg.spring.boot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.spring.boot.demo.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//	public abstract List<Employee> findByFirstName(String firstName);
//
//	public abstract List<Employee> findBySalary(double salary);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);
//
//	public abstract List<Employee> findBySalaryLessThan(double salary);
//
//	public abstract List<Employee> findBySalaryAndFirstName(double salary, String firstName);
//
//	public abstract List<Employee> findBySalaryOrFirstName(double salary, String firstName);

//	@Query(firstName="SELECT e FROM Employee WHERE salary = :salary") // JPQL HQL
//	public abstract List<Employee> findBySomeOtherField(double salary);	

}

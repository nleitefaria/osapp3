package com.mycompany.osapp3.service;

import java.util.List;

import com.mycompany.osapp3.dto.EmployeeDTO;
import com.mycompany.osapp3.entity.Employee;


public interface EmployeeService
{
	Long count() ;
	List<Employee> findAll();
	Employee findOne(String id);
	Employee save(EmployeeDTO countryDTO);

}

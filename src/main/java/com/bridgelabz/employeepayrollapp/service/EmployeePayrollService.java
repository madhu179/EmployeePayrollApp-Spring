package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
	
	@Autowired
	private EmployeePayrollRepository empPayrollRepository;

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return empPayrollRepository.findAll();
	}
	
	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empPayrollRepository.findById(empId).get();
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollData empPayrollData) {
		return empPayrollRepository.save(empPayrollData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollData empPayrollData) {
		empPayrollData.setId(empId);
		return empPayrollRepository.save(empPayrollData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		empPayrollRepository.deleteById(empId);	
	}


	
	

}

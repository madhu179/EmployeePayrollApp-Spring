package com.bridgelabz.employeepayrollapp.service;

import java.util.List;

import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	
	List<EmployeePayrollData> getEmployeePayrollData();
	
	EmployeePayrollData createEmployeePayrollData(
			EmployeePayrollData empPayrollData);
	
	EmployeePayrollData updateEmployeePayrollData(int empId,
			EmployeePayrollData empPayrollData);
	
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	
	void deleteEmployeePayrollData(int empId);

}

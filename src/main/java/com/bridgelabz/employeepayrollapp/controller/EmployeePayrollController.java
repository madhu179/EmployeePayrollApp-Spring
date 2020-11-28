package com.bridgelabz.employeepayrollapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@Autowired
	private IEmployeePayrollService employeePayrollService;
	
	@RequestMapping(value = {"","/","/get"})
	public List<EmployeePayrollData> getEmployeePayrollData(){
		return employeePayrollService.getEmployeePayrollData();
	}
	
	@GetMapping("/get/{empId}")
	public EmployeePayrollData getEmployeePayrollData(@PathVariable("empId") int empId){
		return employeePayrollService.getEmployeePayrollDataById(empId);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollData empPayrollData){
		EmployeePayrollData employeeData = employeePayrollService.createEmployeePayrollData(empPayrollData);
		ResponseDTO respDTO = new ResponseDTO("Created Successfully", "Created data:"+employeeData.toString());
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId,@RequestBody EmployeePayrollData empPayrollData){
		EmployeePayrollData employeeData = employeePayrollService.updateEmployeePayrollData(empId,empPayrollData);
		ResponseDTO respDTO = new ResponseDTO("Updated Successfully", "Updated data:"+employeeData.toString());
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted Id:"+empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

}

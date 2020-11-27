package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Miles", 300000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Miles", 300000));
		ResponseDTO respDTO = new ResponseDTO("Get Call For Id Successful", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);	
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);	
		}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successfully", empData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);	
		}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted Id:"+empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

}

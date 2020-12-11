package it.prodigy.HibCom.controller;

import org.springframework.beans.factory.annotation.Autowired;

import it.prodigy.HibCom.model.Department;
import it.prodigy.HibCom.model.Employee;
import it.prodigy.HibCom.model.Name;
import it.prodigy.HibCom.view.EmployeeView;




@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private Employee model;
	private EmployeeView view;

	
	public Controller(Employee employee, EmployeeView emview) {
		model = employee;
		view = emview;
	}
	
	public void setEmployeeName(Name name) {
		model.setName(name);
	}

	public Name getEmployeeName() {
		return model.getName();
	}
	
	public void setEmployeeSsn(int ssn) {
		model.setSsn(ssn);
	}
	
	public int getEmployeeSsn() {
		return model.getSsn();
	}
	
	public void setEmployeeAddress(String address) {
		model.setAddress(address);
	}
	
	public String getEmployeeAddress() {
		return model.getAddress();
	}
	
	public void setEmployeeSex(char s) {
		model.setSex(s);
	}
	
	public char getEmployeeSex() {
		return model.getSex();
	}
	
	public void setEmployeeSalary(int salary) {
		model.setSalary(salary);
	}
	
	public int getEmployeeSalary() {
		return model.getSalary();
	}
	
	public void setEmployeeSuperviser(int superSsn) {
		model.setSuperSsn(superSsn);
	}
	
	public int getEmployeeSuperviser() {
		return model.getSuperSsn();
	}
	
	public void setEmployeeDnu(Department dep) {
		model.setDep(dep);
	}
	
	public Department getEmployeeDep() {
		return model.getDep();
	}
	
	public void updateView() {
		view.viewEmployeeDetails(model);
	}
}

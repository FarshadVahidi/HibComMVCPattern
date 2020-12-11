package it.prodigy.HibCom.view;

import it.prodigy.HibCom.model.Employee;

public class EmployeeView {
	
	public void viewEmployeeDetails(Employee employee) {
		 System.out.println("Employee: ");
		 System.out.println("   Name: " + employee.getName());
		 System.out.println("   Ssn: " + employee.getSsn());
		 System.out.println("   Address: " + employee.getAddress());
		 System.out.println("   Sex: " + employee.getSex());
		 System.out.println("   Salary: " + employee.getSalary());
		 System.out.println("   SuperV_ssn: " + employee.getSuperSsn());
		 System.out.println("   Dnumber: " + employee.getDep().getDnumber());
	}

}
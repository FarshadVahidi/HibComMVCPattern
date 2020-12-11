package it.prodigy.HibCom.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	private Name name;
	@Id
	private int ssn;
	private String address;
	private char sex;
	private int salary;
	@Column(name="superV_ssn", updatable = true)
	private int superSsn;
	@ManyToOne
	@JoinColumn(name="Dnumber")
	private Department dep;

	

	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSuperSsn() {
		return superSsn;
	}
	public void setSuperSsn(int superSsn) {
		this.superSsn = superSsn;
	}
	
	
	
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
		

}

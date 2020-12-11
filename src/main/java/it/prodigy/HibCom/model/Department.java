package it.prodigy.HibCom.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DEPARTMENT")
public class Department {
	
	@Column
	private String Dname;
	@Id
	private int Dnumber;
	@Column(name="Mgr_Ssn")
	private int MgrSsn;
	@Column(name="Mgr_Start_Date")
	@Temporal(TemporalType.DATE)
	private  Calendar utilCalendar;
	@OneToMany(mappedBy="dep")
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	public String getDname() {
		return Dname;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public int getDnumber() {
		return Dnumber;
	}
	public void setDnumber(int dnumber) {
		Dnumber = dnumber;
	}
	public int getMgrSsn() {
		return MgrSsn;
	}
	public void setMgrSsn(int mgrSsn) {
		MgrSsn = mgrSsn;
	}
	public Calendar getUtilCalendar() {
		return utilCalendar;
	}
	public void setUtilCalendar(Calendar utilCalendar) {
		this.utilCalendar = utilCalendar;
	}
	@Override
	public String toString() {
		return "Department [Dname=" + Dname + ", Dnumber=" + Dnumber + ", MgrSsn=" + MgrSsn + ", utilCalendar="
				+ utilCalendar.getTime() + ", employees=" + employees + "]";
	}
	
	
	
	
	
}

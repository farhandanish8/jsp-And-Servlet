package com.employeeapp.model;

public class Employee {
	private String employeeName;
private Integer employeeId;
private String City;
private double salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeeName, Integer employeeId, String city, double salary) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	City = city;
	this.salary = salary;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", City=" + City + ", salary="
			+ salary + "]";
}

}

package com.kalaiselvi.assignment1.employees;

public class Manager extends Employee {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager: " + "\nName = " + getName()
				+ "\nEmployee Id = " + getEmployeeId()
				+ "\nSalary = " + getSalary()
				+ "\nDepartment = " + dept + "\n";
	}
	

	
}

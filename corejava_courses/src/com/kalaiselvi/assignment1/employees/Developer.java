package com.kalaiselvi.assignment1.employees;

public class Developer extends Employee {

	private String program;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
	@Override
	public String toString() {
		return "Developer: "+"\nName = " + getName()
		+ "\nEmployee Id = " + getEmployeeId()
		+ "\nSalary = " + getSalary()
		+ "\nprogramming =" + program + "\n";
	}
	
}

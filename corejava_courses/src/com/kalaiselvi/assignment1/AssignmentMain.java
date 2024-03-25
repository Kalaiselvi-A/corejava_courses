package com.kalaiselvi.assignment1;

import com.kalaiselvi.assignment1.employees.Developer;
import com.kalaiselvi.assignment1.employees.Manager;
import com.kalaiselvi.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.setName("Nivas");
		manager.setEmployeeId(100);
		manager.setSalary(50000);
		manager.setDept("Project Manager");
		
		Developer developer = new Developer();
		developer.setName("John Smith");
		developer.setEmployeeId(102);
		developer.setSalary(80000);
		developer.setProgram("Java");
		
		EmployeeUtilities util = new EmployeeUtilities();
		
		util.demoEmp(manager); util.demoEmp(developer);
		 
		
		System.out.println(manager);
		System.out.println(developer);
	}

}

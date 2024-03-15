package com.cg.statickeyword;

public class StaticMethod {
	int id = 24; // Non-Static Variable
	static int rollNo = 12; //Static Variable
	
	//static variable
	static {
		System.out.println("Static Block-----");
		//Cannot access Non-Static Variable
		//System.out.println("ID = "+ id);
		System.out.println("Roll No = "+ rollNo);
	}
	
	//Default Constructor
	public StaticMethod() {
		System.out.println("ID = "+ id);
		System.out.println("Roll No = "+ rollNo);
	}
	
	//concrete method or normal method
	void display() {
		System.out.println("Normal Method");
	}
	
	//static method
	static void print() {
		System.out.println("This is a Static method");
	}
}

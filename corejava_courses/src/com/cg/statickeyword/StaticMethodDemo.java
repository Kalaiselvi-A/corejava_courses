package com.cg.statickeyword;

public class StaticMethodDemo {
	
	
	public static void main(String[] args) {
		System.out.println("Main Function");
		StaticMethod sm = new StaticMethod();
	}
	static { //Static block will be run first
		System.out.println("Static in main file");
	}

}

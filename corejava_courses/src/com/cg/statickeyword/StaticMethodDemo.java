package com.cg.statickeyword;

public class StaticMethodDemo {
	
	static {
		System.out.println("Static in main file");
	}

	public static void main(String[] args) {
		System.out.println("Main Function");
		StaticMethod sm = new StaticMethod();

	}

}

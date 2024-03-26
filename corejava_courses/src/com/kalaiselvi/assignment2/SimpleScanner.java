package com.kalaiselvi.assignment2;

import java.util.Scanner;

public class SimpleScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String fName = sc.next() + " " + sc.next();
		//String lName = sc.next();
		int rollno = sc.nextInt();
		char grade = sc.next().charAt(0);
		String percent = sc.next();
		
		System.out.println(fName);
		System.out.println(rollno);
		System.out.println(grade);
		System.out.println(percent);

	}

}
/*
 * Write a java program to get all your details like your Full name with
 * Initial, roll number ,Grade and percentage. 
 * Sample Input: 				Sample Output:
 * 	 Ayan S 						Ayan S 
 * 	 5220365 						5220365 
 * 	 A 								A 
 * 	 9.5% 							9.5%
 */
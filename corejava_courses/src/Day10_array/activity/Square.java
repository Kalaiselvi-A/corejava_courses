package Day10_array.activity;

import java.util.*;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || j==0 || j==n-1 || i==n-1)
					System.out.print("* ");
				else
			       System.out.print("  ");
			}
			System.out.println();
		}

	}

}

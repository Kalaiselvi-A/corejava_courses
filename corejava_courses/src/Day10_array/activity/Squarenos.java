package Day10_array.activity;

import java.util.Scanner;

public class Squarenos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		
		for(i=1;i<n+1;i++) {
			for(j=1;j<n+1;j++) {
				if(i==1 || j==1 || j==n || i==n)
					System.out.print(i+" ");
				else
			       System.out.print("  ");
			}
			System.out.println();
		}


	}

}

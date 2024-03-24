package Day10_array.activity;
import java.util.Scanner;

public class Rtriangle {
	
		public static void main(String args[]) {
			int i;
			int j;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			
			for(i=0;i<n;i++) {
				for(j=(n/2);j<n;j++) {
					System.out.print("* ");			
				}
				System.out.println("\n");
			}
			
		}
		
	}


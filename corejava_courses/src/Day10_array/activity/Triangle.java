package Day10_array.activity;
import java.util.*;

public class Triangle {
	
	public static void main(String args[]) {
		int i;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(i=0;i<=n;i++) {
			for(j=0;j<i;j++) {	
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		
	}
	
}

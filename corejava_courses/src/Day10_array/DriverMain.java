//To demonstrate ArrayOperations

package Day10_array;

public class DriverMain {

	public static void main(String[] args) {
		int n = 10;
		
		int a[] = new int[n];
		ArrayOperations.printArray(a); //to display array
		
		//assign values to array
		for(int i =0; i<a.length; i++)
			a[i] = 3*i;
		
		ArrayOperations.printArray(a);
		
		//initialize at declaration
		int b[] = {10,15,20,25,30}; 
		ArrayOperations.printArray(b);
		
		//variable argument functions
		System.out.println("\nSum of Array Elements : " + ArrayOperations.getSum(b));
		System.out.println("Sum of Array Elements : " + ArrayOperations.getSum(10,20));
		System.out.println();
		
		b[2] = 999;//assign value to b[] array
		ArrayOperations.printArray(b);
		
		//to count odd and even elements in an array b[]
		System.out.println("\n\n-----------------");
		System.out.println("\nOdd Nos : " + ArrayOperations.getOddCount(b) + "\nEven Nos : " + ArrayOperations.getEvenCount(b));
		System.err.println();
		System.out.println("-----------------");
		
		//int c[];
		//ArrayOperations.printArray(c);
		//compile time error
	}

}

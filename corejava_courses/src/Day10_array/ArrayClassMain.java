//Demo of Array Class methods
package Day10_array;
import java.util.*;

public class ArrayClassMain {

	public static void main(String[] args) {
		
		//first array - Arrays.toString()
		int arr[] = {25,13,63,48,59,66,92,73,6};
		System.out.println("Arrray is : " + Arrays.toString(arr));
		
		Arrays.sort(arr); //Sorting - arrays.sort()
		System.out.println("\nSorted Array : " + Arrays.toString(arr));
		
		
		int key = 66;
		System.out.println();
		System.out.println(key + " at index = " + Arrays.binarySearch(arr, key));
		System.out.println(key + " at index = " + Arrays.binarySearch(arr, 1, 3, key));
		
		//second array
		int arr1[] = {34,10,45};
		System.out.println("\nSecond Array : " + Arrays.toString(arr1));
		
		//compare - Arrays.equals()
		if(Arrays.equals(arr, arr1))
			System.out.println("Both are Equal");
		else
			System.out.println("Arrays are not equal");
		
		//Create new array with specified length (i.e 12 here)
		System.out.println("\n\nNew Array by copyOf :");
		int arr2[] = Arrays.copyOf(arr, 12); 
		System.out.print("Array with specific length : " + Arrays.toString(arr2));
		
		System.out.println("\n\nNew Array by copyOfRange :");
		int arr3[] = Arrays.copyOfRange(arr, 1, 3); 
		System.out.print("Array with specific range : " + Arrays.toString(arr3));
		
		//to fill array with 66
		Arrays.fill(arr, key);
		
		System.out.println("\n\nArray on filling 66 : " + Arrays.toString(arr));

	}

}

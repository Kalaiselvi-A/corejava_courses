//to define class with multidimentional array

package Day10_array;

public class MDArray {
	static void printArray(int c[][]) {
		System.out.println("\nArray Elements : ");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}

}

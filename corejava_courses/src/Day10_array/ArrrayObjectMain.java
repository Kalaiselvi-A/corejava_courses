// Demonstrate array of student class objects

package Day10_array;

public class ArrrayObjectMain {

	public static void main(String[] args) {
		Student[] arr = new Student[6];
		
		arr[0] = new Student(1, "Raja");
		arr[1] = new Student(2, "Jack");
		arr[2] = new Student(3, "Max");
		arr[3] = new Student(4, "pooja");
		arr[4] = new Student(5, "Dhivya");
		arr[5] = new Student(6, "Ram");
		
		for(int i = 0; i<arr.length; i++)
			System.out.println("Elements at " + i + " : " + arr[i].getSid() + ". " + arr[i].getName());

	}

}

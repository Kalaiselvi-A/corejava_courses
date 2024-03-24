//driver program for generic method

package Day15_generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
		
		GenericMethod obj = new GenericMethod();
		Integer[] intarr = {10,20,30,40};
		String[] str = {"java","Python","Ruby"};
		Person p[] = new Person[] {
				new Person("Nitin", "Pune"), 
				new Person("Manoj", "Mumbai"),
				new Person("Mayur", "Delhi")
		};
		
		obj.displayArrayElement(intarr);
		
		obj.displayArrayElement(str);
		
		obj.displayArrayElement(p);
	}

}

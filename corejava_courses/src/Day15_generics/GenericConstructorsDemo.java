//driver program for Generic Constructor

package Day15_generics;

public class GenericConstructorsDemo {

	public static void main(String[] args) {
		
		System.out.println("Number to Double");
		
		GenericConstructors obj = new GenericConstructors(78);
		obj.show();
		
		GenericConstructors obj1 = new GenericConstructors(345.879);
		obj1.show();
		
		GenericConstructors obj2 = new GenericConstructors(-8742448824652078965L); 
		obj2.show();
	}

}

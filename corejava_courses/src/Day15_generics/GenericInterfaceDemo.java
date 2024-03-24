//Driver Program - Generic Interface
package Day15_generics;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		
		//compares b/w float values
		Float arr[] = {3.22f,5.2f,9.65f,555.96f,6.0f};
		MinMaxImp<Float> obj1 = new MinMaxImp<Float>(arr);
		System.out.println("Min value : " + obj1.min());
		System.out.println("Max value : " + obj1.max());
		
		//compares b/w string
		String arr1[] = {"amul","Pooja","pooja"};
		MinMaxImp<String> obj2 = new MinMaxImp<String>(arr1);
		System.out.println("Min value : " + obj2.min());
		System.out.println("Max value : " + obj2.max());
		
		//compares of Person object
		Person p[] = new Person[] {
				new Person("Zimal", "Bune"),
				new Person("Sam", "Chennai"),
				new Person("Maya", "Delhi")
		};
		MinMaxImp<Person> obj3 = new MinMaxImp<Person>(p);
		System.out.println("Min value : " + obj3.min());
		System.out.println("Max value : " + obj3.max());

	}

}


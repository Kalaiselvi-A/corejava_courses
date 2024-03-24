//driver program for user defined generic class

package Day15_generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		
		//String data type
		GenericClass<String> strobj = new GenericClass<>();
		strobj.setData("Hi Kalai");
		System.out.println(strobj.getData());
		
		//integer data type
		GenericClass<Integer> intobj = new GenericClass<Integer>();
		intobj.setData(100);
		System.out.println(intobj.getData());
		
		//Person obj of data member
		GenericClass<Person> prsobj = new GenericClass<Person>();
		prsobj.setData(new Person("Ajay","Chennai"));
		System.out.println(prsobj.getData());

	}

}

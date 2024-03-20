//to demonstrate Wrapper Class

package Day9_String;

public class WrapperClassMain {

	public static void main(String[] args) {
		
		//unboxing
		Integer i = new Integer(50);
		System.out.println(i);
		int a = i.intValue();
		System.out.println(a);
		
		//Without intValue
		int b = i;
		System.out.println(b);
		
		//Autoboxing
		int c = 100;
		Integer i1 = c;
		System.out.println(i1);

	}

}

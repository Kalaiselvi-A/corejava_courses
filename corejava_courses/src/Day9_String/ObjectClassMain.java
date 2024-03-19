// to demonstrate object class

package Day9_String;

class Sample {
	
}

class Demo {
	public Demo() {
		System.out.println("\nIn Constructor");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\nIn Finalize()");
	}
}

public class ObjectClassMain {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		//to get a class name
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1 = d;		//Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		
		d= null;
		System.gc();
		System.out.println(d1);

	}

}

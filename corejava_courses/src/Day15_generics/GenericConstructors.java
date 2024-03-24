// to demonstrate generic constructors

package Day15_generics;

public class GenericConstructors {
	
	private double v;
	
	//generic constructor
	public <T extends Number> GenericConstructors(T t)
	{
		v = t.doubleValue();
	}
	
	void show()
	{
		System.out.println("V in double type : " + v);
	}
	
}

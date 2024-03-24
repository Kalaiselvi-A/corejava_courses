//wrapper class -> Command Line Arguments(CLA)

package Day9_String;

public class WrapperClass_CLA {

	public static void main(String args[]) {
		
		System.out.println("Hello World");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}

}

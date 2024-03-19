// to demonstrate String Class

package Day9_String;

public class StringClassMain {

	public static void main(String[] args) {
		char c[] = {'K','A','L','A','I'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Concatenation
		String stm = "This shows how to " + "Concatinate with using the " + "addition[+] operator.";
		System.out.println(stm);
	}

}

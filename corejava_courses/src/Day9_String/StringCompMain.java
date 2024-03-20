package Day9_String;
public class StringCompMain {
	public static void main(String[] args) {
		
		//String Literals stored in string pool
		String s1 = "TNS";
		//String s1 = "tns";
		String s2 = "TNS";
		
		//String objects stored in heap memory
		String s3 = new String("TNS");
		String s4 = new String("TNS");
		
		System.out.println("s1 == s2 : " + (s1 == s2) + "\t\ts1 equals s2 : " + s1.equals(s2));	//.equals compares only the content
		System.out.println("s1 == s3 : " + (s1 == s3) + "\ts1 equals s3 : " + s1.equals(s3));	// but == compares the reference for objects
		System.out.println("s4 == s3 : " + (s4 == s3) + "\ts4 equals s3 : " + s4.equals(s1));
		
		System.out.println("s1 hashCode :" + s1.hashCode());	//.hashCode() compares only the content
		System.out.println("s2 hashCode :" + s2.hashCode());
		
		System.out.println("s3 hashCode :" + s3.hashCode());
		System.out.println("s4 hashCode :" + s4.hashCode());
		
		//compareTo
		System.out.println(s1.compareTo("tns"));	//"tns" is lexicographically less than "TNS". so it returns -ve value
		//System.out.println(s1.compareTo("TNS"));	//"TNS" is lexicographically greater than "tns". so it returns +ve value
		System.out.println(s1.compareToIgnoreCase("tns"));
		System.out.println(s1.compareTo(s2));
		
	}
}

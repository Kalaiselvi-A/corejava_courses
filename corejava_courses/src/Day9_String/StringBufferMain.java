package Day9_String;

public class StringBufferMain {

	public static void main(String[] args) {
		
		// Buffer length vs capacity
		StringBuffer buf = new StringBuffer("Good Morning");
		System.out.println("Buffer = " + buf);
		System.out.println("Length = " + buf.length());
		System.out.println("Capacity = " + buf.capacity());
		
		// append and insert into StringBuffer
		String s;
		int a = 42;
		buf = new StringBuffer(40);
		s = buf.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buf);
		
		//insert
		buf = new StringBuffer("I JAVA");
		buf.insert(2, "like ");
		System.out.println(buf);
		
		//delete
		buf.delete(7,10);
		System.out.println(buf);
		
		//reverse
		System.out.println(buf.reverse());
	}

}

package Day2_oops;

public class Executer {
	public static void main(String args[]) {
		Customer c1 = new Customer();
		c1.setCid(112);
		c1.setCname("Raja");
		c1.setAddress("Puducherry");
		System.out.println("Customer id: "+c1.getCid()+", Customer name: "+c1.getCname()+", Customer Address: "+c1.getAddress());
		
		Customer c2 = new Customer();
		c2.setCid(113);
		c2.setCname("Hema");
		c2.setAddress("Bangalore");
		System.out.println(c2);
		
		Customer c3 = new Customer();
		System.out.println(c3);
		
		Customer c4 = new Customer(114,"Dhivya","Chennai");
		System.out.println(c4);
		
	}
}

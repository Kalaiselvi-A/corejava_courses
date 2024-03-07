package Day3_oops;

public class Executer {
	public static void main(String args[]) {
		Customer c1 = new Customer();
		c1.setCid(112);
		c1.setCname("Raja");
		c1.setAddress("Puducherry");
		System.out.println("Customer id: "+c1.getCid()+" Customer name: "+c1.getCname()+" Customer Address: "+c1.getAddress());
	}
}

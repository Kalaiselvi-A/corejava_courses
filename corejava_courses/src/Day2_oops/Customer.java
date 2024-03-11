//customer entity class
package Day2_oops;

class Customer {
	
	private int cid;
	private String cname;
	private String address;
	
	//default constructor
	public Customer() {
		System.out.println("Default Constructor");
	}
	
	//parameterized constructor
	public Customer(int cid, String cname, String address) {
		
		
		System.out.println("Parameterized Constructor");
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		
	}

	//Getter and setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString()
	{
		return "Customer id: " + cid + ", Customer name: " + cname +", Customer Address: " + address ;
	}
	
	
}

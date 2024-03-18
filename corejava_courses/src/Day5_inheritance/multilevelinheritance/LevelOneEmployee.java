package Day5_inheritance.multilevelinheritance;
import java.util.Date;

public class LevelOneEmployee extends Employee {
	
	private int noShares;
	private String authority;

	//public LevelOneEmployee() {}
	
	public LevelOneEmployee(String name,long contact, Date dob, String dept, double salary,int noShares, String authority) {
		super(name, contact, dob, dept, salary);
		this.noShares = noShares;
		this.authority = authority;
	}

	public int getNoShares() {
		return noShares;
	}

	public void setNoShares(int noShares) {
		this.noShares = noShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmployee ["+super.toString()+"noShares=" + noShares + ", authority=" + authority + "]";
	}
	

}

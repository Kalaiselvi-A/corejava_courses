//Base Class Multilevel inheritance
package Day5_inheritance.multilevelinheritance;
import java.util.Date; 

public class Person {
	
	private String name;
	private long contact;
	private Date dob;
	
	public Person(String name, long contact, Date dob) {
		super();
		this.name = name;
		this.contact = contact;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", dob=" + dob + "]";
	}
	
	

}

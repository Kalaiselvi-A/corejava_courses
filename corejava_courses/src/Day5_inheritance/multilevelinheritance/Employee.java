//derived class of Person
package Day5_inheritance.multilevelinheritance;
import java.util.Date;

public class Employee extends Person {
	
	private String dept;
	private double salary;
	
	//public Employee() {}
	
	public Employee(String name, long contact, Date dob, String dept, double salary) {
		super(name, contact, dob); //call person Class
		this.dept =dept;
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ["+super.toString()+", dept=" + dept + ", salary=" + salary + "]";
	}
	

}

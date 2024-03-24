//multilevel inheritance
package Day5_inheritance.multilevelinheritance;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MultilevelIn {

	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Person p1 = new Person("Athav", 747458763, new Date(2004, 12, 2));
		System.out.println(p1);
		
		p1 = new Employee("James",854216958, new Date(1987, 06, 03), "Sales", 50000);
		System.out.println(p1);
		
		p1 = new LevelOneEmployee("Pavi", 689542585, new Date(1990, 04,28), "Manager", 90000, 200, "Signing Authority");
		System.out.println(p1);
	}

}

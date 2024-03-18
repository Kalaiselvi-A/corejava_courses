//Derived Class of Citizen
package Day5_inheritance.singleinheritance;

public class Student extends Citizen {
	private int sid;
	private String course;
	public Student() {
		System.out.println("Student object created");
	}
	public Student(int cid, String name, int age, int sid, String course) {
		super(cid, name, age);
		this.sid = sid;
		this.course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Citizen ID = " + super.getCid() + "\nCitizen Name = " + super.getName() + "\nCitizen Age = " + super.getAge() + "\nStudent ID = " + getSid() + "\nCourse = " + getCourse();
	}

}

package practice;

public class Student {

	private String name;
	private int roll;
	private double marks;
	
	public Student(String name, int roll, double marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}

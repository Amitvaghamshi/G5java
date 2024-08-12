package inheritencedemo;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	Student(int roll,String name,int marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public void displayMarks() {
		System.out.println("Marks is "+marks);
	}
	
	@Override
	public String toString() {
		return "roll "+roll+" , "+"name"+name +" , marks "+marks;
	}
}

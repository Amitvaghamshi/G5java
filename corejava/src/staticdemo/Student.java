package staticdemo;
import java.util.Arrays;

public class Student {

	String name;
	int roll;
	int marks;
	static String uniName;
	
	
	public static void  run(Student s) {
		System.out.println(s.name+" is running");
	}
	
	public Student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public static void study() {
		 System.out.println("Student is studying");
	}
	
	
	
	public static void main(String[] args) {
//		Student s1=new Student("Albert",12,235);
//		Student s2=new Student("pulkeet",23,245);
//		Student.uniName="CHITKARA";
//		System.out.println(s1.uniName);
//		System.out.println(s2.uniName);
//		
//		System.out.println(Integer.MIN_VALUE);
//		Student.study();
		
		
//		study();
//		run();
		
		System.out.println(uniName);
	}
}

package g5class;

public class Student extends Human{

	
	int rollNo;
	String course;
	Address address;
	
	
	Student(String name,String moNo, int age , int rollNo , String course){
		super(name,moNo,age);
		this.rollNo=rollNo;
		this.course=course;
	}
	
}

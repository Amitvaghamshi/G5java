package g5class;

public class Employee extends Human{


	int salary;
	String dept;
	Address address;
	
	Employee(String name,String moNo , int age , int salary , String dept ){
		super(name,moNo,age);
		this.salary=salary;
		this.dept=dept;
	}
	
}

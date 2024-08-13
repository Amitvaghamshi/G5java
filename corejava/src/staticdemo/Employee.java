package staticdemo;

public class Employee {

    int id;
    String name;
    int salary;
    String dept;
    
    static int counter;
    
	static {
		counter=1;
	}
    
    public Employee(String name,int salary,String dept){
    	this.name=name;
    	this.salary=salary;
    	this.dept=dept;
    	this.id=counter++;
    }
	
	public static void main(String[] args) {
		Employee e1=new Employee("Albert",235654,"CSE");
		Employee e2=new Employee("ABC",34636,"CSE");
		Employee e3=new Employee("XYZ",36663,"EC");
		Employee e4=new Employee("pqr",76757,"EC");
		
//		System.out.println(e1.id);
//		System.out.println(e2.id);
//		System.out.println(e3.id);
//		System.out.println(e4.id);
		
		
		int a=5;
		if(a++==5 && a++==6) {
			
		}
		System.out.println(a);
		
		
	}
}

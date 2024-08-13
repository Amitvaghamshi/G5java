package packagedemo;
import staticdemo.*;
//import staticdemo.Student;
import static java.lang.System.out;
import static java.lang.Math.sqrt;

public class Demo {

	public static void main(String[] args) {
		Employee e=new Employee("ALbert",2345,"CSE");
		Student s=new Student("pulkeet",23,245);
		
		out.println("Hello World");
		out.println(sqrt(245));
	}
}


package inheritencedemo;

public class Demo {

	public static void main(String[] args) {
		
		Student s=new Student(1,"Albert",234);
		System.out.println(s);
		
		Student s2=new Student(1,"Albert",234);
		
		System.out.println(s.equals(s2));
		
	}
}

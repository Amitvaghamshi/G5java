package oopspractice;

import java.util.ArrayList;

public class Student extends Person {

	int roll;
	double marks;
	
	
	Student(String name,int age,int roll,double marks){
		 super(name,age);
		 this.roll=roll;
		 this.marks=marks;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Roll :"+roll);
		System.out.println("marks:"+marks);
	}
	
	public void findGrade() {
		if(marks>=90) {
			System.out.println("GRADE IS A");
		}else if(marks>80 &&  marks<90) {
			System.out.println("GRADE IS B");
		}else if(marks>70 &&  marks<80) {
			System.out.println("GRADE IS C");
		}else if(marks>60 &&  marks<70) {
			System.out.println("GRADE IS D");
		}else {
			System.out.println("GRADE IS F");
		}
	}
	
	public static void main(String[] args) {
//		Student s=new Student("Venu",34,23,78);
//		s.displayDetails();
//		s.findGrade();
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1442);
		list.add(34);
		list.add(76);
		list.add(6);
		
		list.remove(2);
		System.out.println(list);
	}
	
}

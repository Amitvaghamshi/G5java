package staticdemo;

public class NonStaticDemo {
	
	
	int a;
	int b;
	
	{
		System.out.println("Inside Nonstatic block");
	}
	
	NonStaticDemo(int a,int b){
		System.out.println("Inside the constructor");
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		NonStaticDemo o1=new NonStaticDemo(1, 2);
		NonStaticDemo o2=new NonStaticDemo(1, 2);
	}
	
}

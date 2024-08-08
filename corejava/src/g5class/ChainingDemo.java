package g5class;

public class ChainingDemo {

	int a;
	int b;
	int c;
	int d;
	
	ChainingDemo(int a){
		this.a=a;
		System.out.println("Inside 1");
	}
	
	ChainingDemo(int a,int b){
		this(a);
		this.b=b;
		System.out.println("Inside 2");
	}
	
	ChainingDemo(int a,int b,int c){
		this(a,b);
		this.c=c;
		System.out.println("Inside 3");
	}
	
	ChainingDemo(int a,int b,int c,int d){
		this(a,b,c);
		this.d=d;
		System.out.println("Inside 4");
	}
	
	
	public static void main(String[] args) {
		
		ChainingDemo dm=new ChainingDemo(1,2,3,4);
	}
}

package g5class;

public class B extends A{
	int b;
	int c;
	
	B(int a,int b,int c){
		super(a);
		this.b=b;
		this.c=c;
		System.out.println("INSIDE CLASS B");      
	}
	
	void setBC(int b,int c) {
		this.b=b;
		this.c=c;
	}
}

package g5class;

public class Y extends X{

	int i;
	
	Y(int x,int y,int z){
		super(x,y);
		i=z;
	}
	
	 void printi() {
		 System.out.println("value of i is "+ super.i);
	 }
}

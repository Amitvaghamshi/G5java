package g5class;

public class Car extends Vehical{

	String number;
	int noOfDoors;
	
	Car(String brand,String number,int noOfDoors){
		super(brand);
		this.number=number;
		this.noOfDoors=noOfDoors;
	}
	
	@Override
	public void hocking() {
		System.out.println("Car is hocking");
	}
	
	public void printDetails() {
		System.out.println(brand+" "+noOfDoors+" "+number);
	}
	
}

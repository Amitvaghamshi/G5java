package g5class;

public  class Mobile {

	String brand;
	int price;
	int profitPercentage;
	int gstPercentage;
	
	
	  
	
	public Mobile(String brand, int price, int profitPercentage, int gstPercentage) {
		this.brand = brand;
		this.price = price;
		this.profitPercentage = profitPercentage;
		this.gstPercentage = gstPercentage;
	}



	  double sellingPrice() {
		return price + price*(profitPercentage+gstPercentage)/100;
	}
	
	
}

package g5class;

public class LuxuryMobile extends Mobile{

	int fixedCharge;
	
	LuxuryMobile(String brand ,  int price, int profitPercentage, int gstPercentage ,int fixedCharge){
		super(brand,price,profitPercentage,gstPercentage);
		this.fixedCharge=fixedCharge;
	}
	
	@Override
	double sellingPrice() {
		return super.sellingPrice() +fixedCharge;
	}
	
	
	
}

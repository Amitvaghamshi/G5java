package g5class;

public class Area {
	
	double calculateArea(int radious) {
		double area=(3.14d)*radious*radious;
		return area;
	}
	
	int calculateArea(int l,int w) {
		return l*w;
	}
	
	public static void main(String[] args) {
		
		Area a=new Area();
		System.out.println(a.calculateArea(4,5));
	}
	
}

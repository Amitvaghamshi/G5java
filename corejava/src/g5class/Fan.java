package g5class;

public class Fan {

	private int noOfBlads;
	private String color;
	private int rpm;
	String runningStatus="off";
	
	public int getNoOfBlads() {
		return noOfBlads;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setNoOfBlads(int noOfBlads) {
		this.noOfBlads=noOfBlads;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	
	
//	Fan(int noOfBlads,String color,int rpm){
//		this.noOfBlads=noOfBlads;
//		this.color=color;
//		this.rpm=rpm;
//	}
	
	
	public void changeRunningStatus() {
		if(runningStatus.equals("off")) {
			runningStatus="on";
		}else {
			runningStatus="off";
		}
	}
	
	
	
//	public static void main(String[] args) {
//		
//		String s1="off";
//		String s2=new String("off");
//		System.out.println(s1.equals(s2));
//		
////		String[] str= {"abc","xyz","def","pqr"};
////		StringBuffer sb=new StringBuffer();
////		for(int i=0;i<str.length;i++) {
////			sb.append(str[i]);
////		}
////		System.out.print(sb);
//		
//	}
}

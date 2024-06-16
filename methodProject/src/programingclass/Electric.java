package programingclass;

public class Electric {
	public static void main(String args[]) {
	
	int bill=0;
	int units=50;
	if(units>=0 || units<=100) {
		bill=units*0;
		System.out.println(bill);
	}
	
	
	if(units>=101 || units<=200) {
		bill=units*5;
		System.out.println(bill);
	}
	
	
	
	
	
	
	else {
		bill=units*10;
		System.out.println(bill);
	}
	

}}

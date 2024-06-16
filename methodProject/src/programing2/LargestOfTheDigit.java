package programing2;

public class LargestOfTheDigit {

	public static void main(String[] args) {
		int n=145978;
		int rem=0;
		int larg=0;
		int smal=0;
		while(n!=0) {
			rem=n%10;
			if(larg<rem) {
				larg=rem;
			}
			else {
				smal=rem;
			}
			n=n/10;
			
		}
System.out.println(larg+smal);
System.out.println(larg);
System.out.println(smal);
	}

}

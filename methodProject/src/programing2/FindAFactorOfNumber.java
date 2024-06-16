package programing2;

public class FindAFactorOfNumber {

	public static void main(String[] args) 
	{
		int n=10;
		int c=0;
		int sum=0;
		for(int i=1; i<=n; i++)
			if(n%i==0) {
				sum=sum+i;
			c++;
				System.out.println(i+"");
			}
		System.out.println(c);
		System.out.println(sum);
	}

}

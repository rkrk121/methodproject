package programing2;

public class FibonacciAndOddSeries {

	public static void main(String[] args) 
	{
		int n=10;
		int a=1;
		int b=1;
		int c=0;
		int x=1;
		for(int i=0; i<n/2; i++)
		{
			System.out.print(b+" ");
			if(n%2==0) {
				System.out.print(x+" ");
			}
			if(n%2!=0)
			{
				System.out.print(x+" ");
				if(i+1==n/2)
				{
					System.out.print(a+" ");
				}
			}
			x +=2;
			c=a+b;
			b=a;
			a=c;
		}
		

	}

}

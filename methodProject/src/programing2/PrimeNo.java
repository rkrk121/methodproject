package programing2;

public class PrimeNo 
{
	public static void checkprime(int n)
	{
		int c=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
		}

	public static void main(String[] args) 
	{
		checkprime(11);

		 }
}
			
		




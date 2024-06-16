package programingclass;

public class EvenFibonacci 
{
	public static void main(String[] args) 
	{
		print(5);
		
	}
	public static void print(int n)
	{
		int c=0;
		int n1=1;
		int n2=1;
		for(int i=1; ;i++)
		{
			int n3=n1+n2;
			if(n3%2==0) 
			{
				System.out.println(n3+ " ");
				c++;
			}
			if(n==c) 
			{
				System.out.println("hello");
				break;
			}
			n1=n2;
			n2=n3;
		}
		
	}

}

package programingclass;

public class CountNoOfDigit 
{
	public static int count(int num)
	{
		int c=0;
	
		while(num>0)
		{
			int rem = num%10;
			c++;
			num=num/10;
			
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println(count(100));
	}

}

package programingclass;

public class NthEvenfibonacci 
{
	public static void main(String[] args) 
	{
		System.out.println(print(3));
		
	}
	public static int print(int n)
	{   
		
		int c=0;
		int n1=1;
		int n2=1;
		int n3=0;
		
		for(int i=1;   ; i++)
		{
			 n3=n1+n2;
			if(n3%2==0)
			{
				c++;
			}
			if(n==c)
			{
				break;
			}
            n1=n2;
            n2=n3;
		
		}
		return n3;
		
		
	}
}

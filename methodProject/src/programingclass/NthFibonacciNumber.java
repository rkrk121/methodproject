package programingclass;

import java.util.Scanner;

public class NthFibonacciNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no to find nth fibonacci");
		int n = s.nextInt();
		
		System.out.println(print(n));
		s.close();
		
	}
public static int print(int n)
{
	if(n==1)
	{
		return 0;
	}
	else {
	int n1=0;
	int n2=1;
	int n3=0;
	for(int i=1; i<=n-2; i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
	}
	  return n3;
	}
	
}
}

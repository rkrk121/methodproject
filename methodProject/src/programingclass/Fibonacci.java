package programingclass;

import java.util.Scanner;

public class Fibonacci 
{
	public static void print(int n)
	{
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		for(int i=1; i<=n-2; i++) 
		{
			int n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			}
		
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter integer number");
	int n=s.nextInt();
	print(n);
	s.close();
	
	
}
}

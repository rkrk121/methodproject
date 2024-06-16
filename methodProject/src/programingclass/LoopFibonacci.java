package programingclass;

import java.util.Scanner;

public class LoopFibonacci 
{
public static void print(int n)
{
	if(n>1)
	{
		int n1=0;
		int n2=1;
		System.out.println(n1+" "+n2);
		for(int i=1;i<=n-2;i++)
		{
			int n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			}
	}
	
		else 
		{
			System.out.println(0);
		}
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter int Number");
	int n=s.nextInt();
	print(n);
	s.close();
	
	
}
	}


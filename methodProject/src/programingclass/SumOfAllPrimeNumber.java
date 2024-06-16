package programingclass;

import java.util.Scanner;

public class SumOfAllPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first Number");
		int first=s.nextInt();
		System.out.println("Enter second number");
		int last=s.nextInt();
		int sum = 0;
		for(int i=first;i<=last; i++)
		{
			if(isprime(i)) {
				sum=sum+i;
			}
			
			
		}
		System.out.println(sum);
	}
	public static boolean isprime(int n)
	{
		if(n<=1) {
			return false;
		}
		else {	for(int i=2;i<=n/2; i++)
				{
					if(n%i==0) {
						return false;}
					}
				}
		return true;
	}

}

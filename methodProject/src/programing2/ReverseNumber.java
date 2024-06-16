package programing2;

public class ReverseNumber 
{
	public static int revNumber(int n)
	{
		int rev=0;
		return rev;
	}
	public static void main(String[] args) {
		int n=123;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			System.out.print(rem);
		}
	}
}

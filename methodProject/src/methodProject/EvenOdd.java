package methodProject;

public class EvenOdd 
{
public static void main(String[] args) 
	{
	EvenOdd.check(10); //here n is the actual argument
	}
	public static void check(int n)  //here int n is the formal argument
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}

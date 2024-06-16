package methodProject;

public class MethodA 
{
	public static void morning()
	{
		System.out.println("Good Morning");
		MethodA.noon();
	}
	public static void noon()
	{
		System.out.println("Good Afternoon");
	}
	public static void main(String[] args) 
	{
		MethodA.morning();
		System.out.println("Done");
	}
}

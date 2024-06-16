package programingclass;

public class BuzzNumber {
	
public static String check(int number)
{
	if(number%10==7||number%7==0)
	{
		return "buzznumber";

	}
	else
		return "not buzznumber";
}
public static void main(String[] args) 
{
System.out.println(check(48));
System.out.println(check(109));
System.out.println(check(177));
System.out.println(check(49));
System.out.println(check(489));
}
}

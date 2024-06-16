package programingclass;

public class LeapYear 
{
public static String check(int year)
{
	if(year%400==0 ||year%100!=0 && year%4==0)
	{
		return "leapYear";
	}
	else
	{
		return "Not LeapYear";
	}
}public static void main(String[] args) 
{
	System.out.println(check(2004));
	System.out.println(check(2002));
	System.out.println(check(2000));
	System.out.println(check(2100));
	System.out.println(check(1996));
}
}

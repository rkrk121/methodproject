package programingclass;

public class Check 
{
/*public static boolean check(int num)
{
if(num%2==0)
	return true;
    return false;
}
public static void main(String[] args) {
	{
		System.out.println(check(4));
	}
}
*/
public static String check(int num)
{
	if(num/2*2==num-1)
	return "odd";
	return "even";
	}
public static void main(String[] args) {
	{
		System.out.println(check(11));
	}
}
}

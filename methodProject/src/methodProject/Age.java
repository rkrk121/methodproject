package methodProject;

public class Age 
{

	public static void main(String[] args) 
	{
	Age.check(73); //senior citizen, retirement age
	Age.check(53); //not in retirement age
}
	public static void check(int age)
	{
		if(age<60) 
		{
			System.out.println("not in retirement age");
		}
		else
		{
			System.out.println("retirement age");
		}
			
		
	}

}

package programingclass;

public class WhileLoop {

	public static void main(String[] args) 
	{
		System.out.println(print(120));
		

	}
	public static int print(int num)
	{
		int c=0;
		while(num>0);
		{
			int remander=num%10;
			c++;
			num=num/10;
			
		}
		return c;
		
	}


}

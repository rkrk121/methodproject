package programing2;

public class Swap3 {          //swap two number with using xor ^ operator

	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("Before swap a="+a+" b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap a="+a+" b="+b);
		

	}

}

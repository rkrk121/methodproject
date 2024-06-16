package programing1;

public class Concatation {

	public static void main(String[] args) 
	{
		String s1="hello"+"hi";
		String s2="hello"+10;
		String s3="hello"+true;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("hello"+"hi"+10+false);
		System.out.println("hello"+10+20);  //printing left to right
		System.out.println(10+20+"hello");
		System.out.println("hello"+(10+20));
	
		

	}

}

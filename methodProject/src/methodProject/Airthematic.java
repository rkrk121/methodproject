package methodProject;

public class Airthematic 
{
public static void main(String[] args)
	{
	System.out.println("starts");
	Airthematic.add();            //method call statement
	System.out.println("Ends");
	}  //main method end
public static void add()
{
	System.out.println("add method exceuting");
	System.out.println(12+10);
	System.out.println(15+14);
	Airthematic.sub();                       //method call statement
	System.out.println("add method continue........");
	System.out.println(100+40);
}     //add method ends
public static void sub()
{
	System.out.println("substratction method is executing");
	System.out.println(30-26);
	System.out.println(25-17);
	System.out.println("substraction method end");
	
}  //sub method end

}  //class ends

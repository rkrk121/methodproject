package methodProject;
import java.util.Scanner;
public class A 
{
public static void main(String [] args) 
{   add();
//	A.add(10,20);
//	A.add(15,12);
//	A.add(18,16);
//}
//public static void add(int a, int b)
//{
//	System.out.println(a+b);
}
public static int add() {
  Scanner s = new Scanner(System.in);
  System.out.println("enter the first value");
  int a = s.nextInt();
  System.out.println("enter the second value");
  int b = s.nextInt();
  if(a>21&&b>21) 
	  return 0;

  
}}

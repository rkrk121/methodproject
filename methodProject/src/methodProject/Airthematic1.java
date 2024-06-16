package methodProject;

public class Airthematic1
{

public static void main(String [] args)
{
int a=12;
int b=5;
Airthematic1.add(a,b);
Airthematic1.sub(a,b);
Airthematic1.mul(a,b);
Airthematic1.div(a,b);
}
public static void add(int a,int b)
{
System.out.println("add result is"+(a+b));
}
public static void sub(int a, int b)
{
System.out.println("sub result is"+(a-b));
}
public static void mul(int a,int b)
{
System.out.println("multiplied result is"+(a*b));
}
public static void div(int a,int b)
{
System.out.println("division result is"+(a/b));
}
}


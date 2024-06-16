package methodProject;

public class Marksheet 
{
public static void main(String[] args) 
{
 float math=89.5f;
 float phy=78.2f;
 float che=98.4f;
 Marksheet.total(math,phy,che);
}
public static void total(float m1,float m2,float m3)
{
	float mark=m1+m2+m3;
	System.out.println("total mark is"  + mark);
	Marksheet.percentage(mark);
	}
public static void percentage(float m)
{
	float per=m/3;
	System.out.println("percentage of student is"  + per);
}
}

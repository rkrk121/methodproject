package pattern;

public class OddNoPattern 
{
	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.printf("%4d",x);
				x=x+2;
			}
			System.out.println();
		}
	}

}

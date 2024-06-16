package programing2;

public class IfElse {

	public static void main(String[] args) {
		sgfcd("aparna",true);
		sgfcd("aparna",false);
		sgfcd("suparna",true);
		sgfcd("suparna",false);
		sgfcd("sampurna",false);	
	}
	public static void sgfcd(String gf,boolean doubt)
	{
		if (gf.equals("aparna")&&doubt== true){
				System.out.println("no aparna wont go for dinner");
				}
		else if (gf.equals("aparna")&& doubt == false) {
			System.out.println("yes aparna will go for dinner");
		}
		else if (gf.equals("suparna")&& doubt == true) {
			System.out.println("N0 suparna wont go for dinner");
		}
		else if (gf.equals("suparna")&& doubt == false ) {
			System.out.println("yes suparna will go for dinner");
		}
		else {
			System.out.println("new gf spotted");
		}
	}

}

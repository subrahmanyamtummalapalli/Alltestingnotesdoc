package methods;

public class MethodOverRiding2 extends MethodOverRiding {
	
	public static void payment()
	{
		System.out.println("bad payment");
	}

	public static void main(String[] args) {
		MethodOverRiding2 mo=new MethodOverRiding2();
		mo.payment();

	}

}

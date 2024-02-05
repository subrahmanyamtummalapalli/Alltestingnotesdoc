package methods;

public class MethodOverloading {
	
	public static void payment(String name)
	{
		System.out.println(name);
		
	}
	public static void payment(String name,int num)
	{
		System.out.println(name);
		System.out.println(num);
		
	}
	public static void payment(String name,String cardType)
	{
		System.out.println(name);
		System.out.println(cardType);
		
	}
	

	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.payment("sbi");
		mol.payment("sbi",12345);

	}

}

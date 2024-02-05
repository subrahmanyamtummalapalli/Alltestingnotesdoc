package forLoops;

public class SwapWithoutVar {
	
	public static void withOut()
	{
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		 withOut();

	}

}

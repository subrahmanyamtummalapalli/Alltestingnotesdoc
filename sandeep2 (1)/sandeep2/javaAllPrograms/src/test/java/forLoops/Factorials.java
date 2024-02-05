package forLoops;

public class Factorials {
	
	public static void fact()
	{
		int product=1;
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
			product=product*i;
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		
		fact();
	}

}

package forLoops;

public class FibnociiSeries {
	
	public static void fibnoic()
	{
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		
		for(int i=1;i<=8;i++)
		{
			c=a+b;
			System.out.println(c);
			
		a=b;
		b=c;
		}
		
	}

	public static void main(String[] args) {
		
		fibnoic();
	}

}
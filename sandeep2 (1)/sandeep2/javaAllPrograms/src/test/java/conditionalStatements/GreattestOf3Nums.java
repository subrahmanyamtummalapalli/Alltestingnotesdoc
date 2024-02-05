package conditionalStatements;

public class GreattestOf3Nums {
	
	public static void greattest()
	{
		int a=10,b=20,c=30;
		if(a>b&&a>c)
		{
			System.out.println("a is greattest number");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is greattest number");
		}
		else if(c>a&&c>b)
		{
			System.out.println("c is greattest number");
		}
	}

	public static void main(String[] args) {
		
		greattest();
	}

}

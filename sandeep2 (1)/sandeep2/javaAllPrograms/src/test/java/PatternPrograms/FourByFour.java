package PatternPrograms;

public class FourByFour {
	
	public static void pattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		pattern();
	}

}

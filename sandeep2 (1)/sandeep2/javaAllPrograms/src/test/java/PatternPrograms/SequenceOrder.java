package PatternPrograms;

public class SequenceOrder {
	
	public static void sequence()
	{
		int a=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		sequence();

	}

}

package PatternPrograms;

public class ThreeAnd2ndMissing {
	public static void pattern2()
	{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i==3&& j>=2)
			{
				System.out.print("");
			}
			else
			{
			System.out.print("*");
			}
		}
		System.out.println();
	}
	}
		

	public static void main(String[] args) {
		
		pattern2();
	}

}
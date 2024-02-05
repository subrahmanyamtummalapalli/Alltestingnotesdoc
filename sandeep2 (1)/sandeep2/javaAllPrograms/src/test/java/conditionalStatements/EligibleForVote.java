package conditionalStatements;

public class EligibleForVote {
	
	public static void vote()
	{
		int age=21;
		if(age>=21)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

	public static void main(String[] args) {
		
		vote();
	}

}

package conditionalStatements;

public class DivisibleBy4 {
	
	public static void divisible()
	{
		int num=22;
		if(num%4==0 && num%2==0)
		{
			System.out.println("its divisible by 4");
		}
		else
		{
			System.out.println("its not divisible by 4");
		}
	}

	public static void main(String[] args) {
		
		divisible();
	}

}

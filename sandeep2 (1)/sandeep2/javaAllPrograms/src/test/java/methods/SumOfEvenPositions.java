package methods;

public class SumOfEvenPositions {
	
	public static void numbers()
	{
		int num=123456,sum=0,rem;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		numbers();
	}

}

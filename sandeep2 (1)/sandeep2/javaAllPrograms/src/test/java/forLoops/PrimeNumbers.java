package forLoops;

public class PrimeNumbers {
	
	public static void prime()
	{
		
//		int i=0;
//		int num=0;
		String primeNumbers="";
	
	for(int i=1;i<=100;i++)
	{
		int count = 0;
		for(int num=i;num>=1;num--)
		{
			if(i%num==0)
			{
			count++;
			}
		}
		if(count==2)
		{
			primeNumbers=primeNumbers+i;
			
		}
		
	}
	System.out.println(" "+primeNumbers+" " );
	
		
	}

	public static void main(String[] args) {
		
		prime();
	}

}
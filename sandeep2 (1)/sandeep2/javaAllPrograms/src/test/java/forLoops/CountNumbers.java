package forLoops;

public class CountNumbers {
	
	public static void count()
	{
		int count=0;
		for(int i=1;i<=30;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		count();
	}

}

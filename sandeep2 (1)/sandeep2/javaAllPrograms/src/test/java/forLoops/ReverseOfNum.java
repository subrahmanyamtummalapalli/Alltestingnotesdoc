package forLoops;

public class ReverseOfNum {
	
	public static void reverse()
	{
		int sum=0;
		for(int i=85;i>=65;i--)
		{
			if(i%2==0)
			{
			System.out.println(i);
			sum=sum+i;
			}
			//sum=sum+i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		reverse();

	}

}

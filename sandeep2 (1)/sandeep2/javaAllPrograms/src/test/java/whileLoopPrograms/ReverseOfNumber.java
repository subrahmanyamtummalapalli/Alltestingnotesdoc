package whileLoopPrograms;

public class ReverseOfNumber {
	
	public static void reverse()
	{
		int num=121,rev=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println(temp+"is a palindrome");
		}
		else
		{
			System.out.println(temp+"is not a palindrome");
		}
	}

	public static void main(String[] args) {
		
		reverse();
	}

}

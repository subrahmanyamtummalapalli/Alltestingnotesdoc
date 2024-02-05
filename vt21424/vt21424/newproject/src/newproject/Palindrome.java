package newproject;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=454;
		int temp=n;
		int rev=0;
		int rem;
		if(n!=0) 
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		

	}

}

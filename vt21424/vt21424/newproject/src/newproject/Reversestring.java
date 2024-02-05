package newproject;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="python with testing";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
if(s.equals(rev))
{
	System.out.println("string is a palindrome");
	}
else {
	System.out.println("string not a palindeome");
}
	}
	
}

package project5;

import java.util.Scanner;

public class comparetwostring {

	private static String reverse;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner read=new Scanner(System.in);
		
		String str=read.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
	 rev = rev +str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not a palindrome");
		}
	}

}

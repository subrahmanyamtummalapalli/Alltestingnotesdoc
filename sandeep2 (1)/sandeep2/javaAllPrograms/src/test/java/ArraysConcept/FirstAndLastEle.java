package ArraysConcept;

import java.util.Scanner;

public class FirstAndLastEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("enter the size elements:");
		
		size=sc.nextInt();
		System.out.println("enter data:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(a[0]);
		
		System.out.println(a.length-1);

	}

}
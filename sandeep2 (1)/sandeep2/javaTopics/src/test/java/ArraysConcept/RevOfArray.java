package ArraysConcept;

import java.util.Scanner;

public class RevOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements");
		int size;
		size=sc.nextInt();
		System.out.println("enter the data:");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}

}

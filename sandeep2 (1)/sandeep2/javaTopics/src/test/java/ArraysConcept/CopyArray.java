package ArraysConcept;

import java.util.Scanner;

public class CopyArray {

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
		int b[]=new int[a.length];
		for(int j=0;j<a.length;j++)
		{
			b[j]=a[j];
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(b[k]);
		}

	}

}

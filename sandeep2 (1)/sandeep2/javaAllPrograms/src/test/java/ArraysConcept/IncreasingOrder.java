package ArraysConcept;

import java.util.Scanner;

public class IncreasingOrder {

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
		int temp;
		for(int j=0;j<a.length;j++)
		{
			for(int k=0;k<a.length;k++)
			{
				if(a[k]>a[k+1])
				{
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
				}
			}
		}
		for(int l=0;l<a.length;l++)
		{
			System.out.println(a[l]);
		}

	}

}

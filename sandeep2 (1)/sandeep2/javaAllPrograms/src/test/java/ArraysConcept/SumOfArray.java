package ArraysConcept;

import java.util.Scanner;

public class SumOfArray {

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
		int sum=0;
		for(int j=0;j<a.length;j++)
		{
			if(j%2==0)
			sum=sum+a[j];
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
		

	}

}
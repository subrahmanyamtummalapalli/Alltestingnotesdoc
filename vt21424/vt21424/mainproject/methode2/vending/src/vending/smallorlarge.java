package vending;
import java.util.*;

public class smallorlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int large,small,i;
		int a[] = new int[]{ 2, 3, 4, 5,6,7,8,9,10};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];

		if(a[i]<small)
		small=a[i];
		}

		System.out.println("small number:" + small );
		System.out.print("large number:"+ large );

	}

}

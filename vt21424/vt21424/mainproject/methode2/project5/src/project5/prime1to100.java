package project5;

public class prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1,n=100;
		for(int i=m;i<=n;i++)
		{
		int count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}

		if(count==2)
		{
		System.out.println(i);
		}
		}



	}

}

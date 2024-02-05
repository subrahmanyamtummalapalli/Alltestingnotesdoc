package project5;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=5;
		int num1=0;
		int num2=1;
		for(int i=0;i<count;i++)
		{
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(num1);
		}
			
	}

}

package whileLoopPrograms;

public class AmstrongNum {
	
	public static void amstrong()
	{
		int num=153,rev=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+(rem*rem*rem);
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println(temp+"is a amstrong");
		}
		else
		{
			System.out.println(temp+"is not a amstrong");
		}
	}

	public static void main(String[] args) {
		
		amstrong();
	}

}

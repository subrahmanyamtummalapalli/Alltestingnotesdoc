package project1;

import java.util.Scanner;

public class NumberToWords {
public static String[] units = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirtteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	
	public static String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	
	
	public static  String convert(int n)
	{
		if(n<0) // n=0
		{
			return "Minus" + " " + convert(-n);
		}
		
		if(n<20)//n=0
		{
			return units[n];//units[0]
		}
		if(n<100) // 20 - 99
		{
			return tens[n/10] + ((n%10 != 0)? " ": " ") + units[n%10];
		}
		if(n<1000) //one Hundred 100 t0 999
		{
			return units[n/100] + " " + "Hundred" + ((n%100 != 0)? " ": " ") + convert(n%100);
		}
		if(n<100000)// 1000 to 9999
		{
			return convert(n/1000) + " " + "Thousand" + ((n%10000 != 0)? " ": " ") + convert(n%1000);
		}
		if(n<10000000)//10000 to 99999
		{
			return convert(n/100000) + " " + "Lakh" + ((n%100000 != 0)? " ": " ") + convert(n%100000);
		}
		if(n<10000000)
		{
			return convert(n/10000000) + ((n%10000000 != 0)? " ": " ") + convert(n%10000000);
		}
		return null;
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a number to convert into word format:");
		Scanner input = new Scanner(System.in);
		
			int n=input.nextInt();
			System.out.println(convert(n) + " " );
		
		
		

	}
}

	



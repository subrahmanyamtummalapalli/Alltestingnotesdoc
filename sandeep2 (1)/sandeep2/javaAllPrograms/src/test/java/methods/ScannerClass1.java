package methods;

import java.util.Scanner;

public class ScannerClass1 {
	
	public static void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name = sc.next();
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		scan();
	}

}

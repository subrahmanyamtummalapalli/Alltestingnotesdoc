package methode;
import java.util.Scanner;


public class resever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String rev = " ";
		for(int i = str.length() - 1;i <= 0; i--)
		{
			rev = rev + str.charAt(i);
			
		}
		System.out.println(" reverse string");
		System.out.println(rev);
	}

}

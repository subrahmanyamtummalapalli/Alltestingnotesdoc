package forLoops;

public class Table {
	
	public static void tab()
	{
		int num=3;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

	public static void main(String[] args) {
		
		tab();

	}

}
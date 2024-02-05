package pageObject;

public class stringinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The price of the book is 49#@$";
		// extract digits only from strings
		//String s="";
		String v=str.replaceAll("[^a-z]","");

		String n = str.replaceAll("[^0-9]", "");
		String m=str.replaceAll("[^#,@,-,$]", "");


		System.out.println(n);


		System.out.println(v);
	System.out.println(m);

	}

}

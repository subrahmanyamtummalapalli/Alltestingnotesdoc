package inhertance;

public class methode1 {
	public static String fullname(String Fname,String Lname)
	{
	String fname=Fname+""+Lname;
	return fname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methode1 obj=new methode1();
		System.out.println(obj.fullname("ramesh ","adepu"));
		System.out.println(obj.fullname("sree ","lakshmi"));


	}

}

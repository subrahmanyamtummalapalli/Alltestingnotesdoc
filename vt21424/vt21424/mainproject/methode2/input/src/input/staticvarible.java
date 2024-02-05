package input;

public class staticvarible {
	int id;
	String name;
	static String company="Ojas Innvoative Technology";
	public void emp (int i, String n)
	{
		id=i;name=n;
	}
	public void display()
	{
		System.out.println (name+" "+id+" "+company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvarible obj1=new staticvarible();
		staticvarible obj2=new staticvarible();
		obj1.emp(1,"Ramesh");
		obj2.emp(2,"Rajesh");
		obj1.display();
		obj2.display();

	}

}

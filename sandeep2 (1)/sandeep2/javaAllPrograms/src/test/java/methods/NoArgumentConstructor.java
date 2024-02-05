package methods;

public class NoArgumentConstructor {
	String name;
	public NoArgumentConstructor()
	{
		 name="sandeep";
	}

	public static void main(String[] args) {
		
		NoArgumentConstructor nac=new NoArgumentConstructor();
		System.out.println(nac.name);
	}

}

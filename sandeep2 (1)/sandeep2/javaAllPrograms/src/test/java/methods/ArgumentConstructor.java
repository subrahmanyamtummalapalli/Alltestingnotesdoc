package methods;

public class ArgumentConstructor {
	String name;
	public ArgumentConstructor(String name)
	{
		this.name=name;
		System.out.println(name);
	}

	public static void main(String[] args) {
		ArgumentConstructor ac=new ArgumentConstructor("sandeep");
		

	}

}

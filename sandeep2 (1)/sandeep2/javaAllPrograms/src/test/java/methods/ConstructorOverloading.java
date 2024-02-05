package methods;

public class ConstructorOverloading {
	
	String name;
	int num;
	float salary;
	public ConstructorOverloading(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public ConstructorOverloading(String name,int num)
	{
		this.name=name;
		this.num=num;
		System.out.println(name+" "+num);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading col=new ConstructorOverloading("sandeep");
		ConstructorOverloading col1=new ConstructorOverloading("sandeep",22036);
	}

}

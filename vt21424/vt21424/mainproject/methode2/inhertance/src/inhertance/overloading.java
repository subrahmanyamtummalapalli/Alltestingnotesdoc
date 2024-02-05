package inhertance;

public class overloading {
	 static int add(int a,int b)
	 {
		 return a+b;
	 }
	
static int add1(int a,int b,int c)
{
	return a+b+c;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(overloading.add(10, 20));
		System.out.println(overloading.add1(10, 20, 30));

	}

}

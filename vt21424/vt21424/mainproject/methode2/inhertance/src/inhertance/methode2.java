package inhertance;

public class methode2 extends methode1{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methode2 obj=new methode2();
		methode1 obj1=new methode1();
		System.out.println(obj1.fullname("ramesh ","adepu"));
		//System.out.println(obj.add(10, 20));
		System.out.println(100);

	}

}

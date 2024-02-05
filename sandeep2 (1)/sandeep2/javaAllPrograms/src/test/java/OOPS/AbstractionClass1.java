package OOPS;

public class AbstractionClass1 extends AbstractionClass {

	public static void main(String[] args) {
		
		AbstractionClass1 ab=new AbstractionClass1();
		ab.abs();
		ab.xyz();
		ab.sandeep();
		

	}

	@Override
	public void abs() {
		System.out.println("abc");
		
	}

	@Override
	public void xyz() {
		System.out.println("xyz");
		
	}

	

}

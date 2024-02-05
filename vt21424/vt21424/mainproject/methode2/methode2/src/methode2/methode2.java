package methode2;
//non staticm 
public class methode2 {
	public void add() {
		int a=10;//local varable
		int b=25;
		int c=a+b;
	
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methode2 obj=new methode2();
		obj.add();
		
		
	}

}

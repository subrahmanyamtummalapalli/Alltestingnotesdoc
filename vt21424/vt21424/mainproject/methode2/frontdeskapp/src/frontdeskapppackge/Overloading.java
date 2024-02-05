package frontdeskapppackge;

public class Overloading {
	public static void sum(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void sum(int a,int b ,int c) {
		int e=a+b+c;
		System.out.println(e);
	}
	public static void main(String[] args) {
		sum(1,2);
		sum(1,2,3);
		
	}
}

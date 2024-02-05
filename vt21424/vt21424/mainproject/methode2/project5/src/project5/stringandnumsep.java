package project5;

public class stringandnumsep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The boy is8558 good 384";
		String t="";
		String v=s.replaceAll("[^a-z]"," ");
		String n=s.replaceAll("[^0-9]","");
		System.out.println(v);
		System.out.println(n);
		

	}

}

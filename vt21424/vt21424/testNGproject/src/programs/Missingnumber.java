package programs;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m="subbu i%%s good boy 1234 @#$%";
		char ch[]=m.toCharArray();
		StringBuffer a=new StringBuffer();
		StringBuffer b=new StringBuffer();
		StringBuffer c=new StringBuffer();
		for(int i=0;i<m.length();i++)
		{
		       if(Character.isAlphabetic(m.charAt(i)))
		       {
	                a.append(m.charAt(i));
	            } 
		       else if(Character.isDigit(m.charAt(i)))
		       {
		    	   b.append(m.charAt(i));
		       }
		       else
		       {
		    	   c.append(m.charAt(i));
		       }
		       

		}
		System.out.println(a );
		System.out.println(b );
		System.out.println(c );
		
	}

}

package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Inflater;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Anusha  weds RAkesh");
		a.add("rakesh");
		a.add("anusha");
		
		//System.out.println(a.remove(3));
		
//		for(String x:a)
//		{
//			System.out.println(x);
//		}
	System.out.println(a);
	Iterator<String> x=a.iterator();

	while(x.hasNext())
	{
		System.out.println(x.next());
		                         
	}
	Set<String> b=new HashSet<String>();
	
	b.add("ss");
	HashMap<Integer,String> c=new HashMap<Integer,String>();
	c.put(1, " etfhwegf");
	c.put(2, "subbu");
	System.out.println(c);
	
	
	
	}

}

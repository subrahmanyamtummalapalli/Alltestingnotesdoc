package newproject;

public class Duplicate {
public static void main(String[] args) {
	int subbu[]= {1,2,3,4,5,6,6,7,4,2,1};
	
	for(int i=0;i<subbu.length;i++)
	{
		for(int j=0;j<subbu.length;j++)
		{
			if(subbu[i]==subbu[j])
			{
				System.out.println(subbu[j]);
			}
		}
	}
	
}
}

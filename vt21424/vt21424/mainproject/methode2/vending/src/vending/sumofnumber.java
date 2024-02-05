package vending;

public class sumofnumber {

	public static void main(String[] args) {
		int arr []  = new int [] {1, 2,  4, 5, 6, 7, 8};  
		int sum = 0;  
		for (int i = 0; i < arr.length; i++) //only for loop
		{  
		sum = sum + arr[i];  
		}  
		System.out.println("Sum of all the elements of an array: " + sum);
		for(int i: arr)//this is called as a foreach loop
		{
			System.out.println(i);
		}
	}

}

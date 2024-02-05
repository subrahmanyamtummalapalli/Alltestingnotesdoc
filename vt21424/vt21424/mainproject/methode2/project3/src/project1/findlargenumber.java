package project1;

import java.util.Arrays;

public class findlargenumber {

	
		  
		public static int getLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-1];  
		}  
		public static void main(String args[]){  
		 
		int b[]={44,66,99,77,33,22,55};  
		  
		System.out.println("Largest: "+getLargest(b,7));  
		}

	} 



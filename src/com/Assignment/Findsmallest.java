package com.Assignment;

public class Findsmallest {
	
	public static void smallest(int x, int y, int z)
	{
		System.out.println("The Smallest Value is" + z);
	}

	public static void main(String[] args) {

		int x= 25;
		int  y= 45;
		int z= 64;
	
		if(x > y && x>z)
		{
			System.out.println("input the first number:" + x);
		}
		else if(y>z)
		{
			System.out.println("input the second number:"+ y);
			
		}
		else
		{
			System.out.println("input the third number:"+ z);
			
		}
		
		Findsmallest obj = new Findsmallest();
		
		
	

	}

}

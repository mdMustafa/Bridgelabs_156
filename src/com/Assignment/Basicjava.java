package com.Assignment;

public class Basicjava {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
   public void sub(int a, int b)
   {
	   System.out.println(a-b);
   }
   public void div(int a,int b) {
	   System.out.println(a/b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basicjava obj = new Basicjava();
		obj.add(2,6);
		obj.sub(2, 6);
		obj.div(12, 15);
		System.out.println("helloworld \n Muhammed" );
		
		
		int a = 60;
		int b = 40;
		
		if(a != b)
		{
			System.out.println("60 != b =4 " + (true) );
		}
		
		if(a < b)
		{
			System.out.println("a < b => " + (true));
		}
		
		if(a <= b)
		{
			System.out.println("a <= b => " + (true));
		}

	}

}

/*
 * 25 != 39 => true
 *  25 < 39 => true 
 *  25 <= 39 => true
 */
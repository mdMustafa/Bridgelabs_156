package com.Assignment;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Find_largest_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the any number :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is largest num :" + a);
		}
		 else if(b>c) {
			System.out.println("b is largest num :" + b);
}
		 else {
			System.out.println("c is largest num :" + c);
			
		}
	}
}
		 
		  
		 
		

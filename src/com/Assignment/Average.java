package com.Assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input the first number");
		double num1 =sc.nextDouble();
		System.out.println("input the second number");
		double num2 =sc.nextDouble();
		System.out.println("input the third number");
		double num3 = sc.nextDouble();
        System.out.print("The average value is " + average(num1,num2, num3)+"\n" );
    }

  public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }




	}



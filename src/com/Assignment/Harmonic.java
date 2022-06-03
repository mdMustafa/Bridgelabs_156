package com.Assignment;

public class Harmonic { 
		   public static void main(String[] args) { 
		 
		      int x = Integer.parseInt(args[0]);
		 
		      // compute 1/1 + 1/2 + 1/3 + ... + 1/x
		      double sum = 0.0;
		      for (int i = 1; i <= x; i++) {
		            //sum += 1.0 / i;
		         sum = sum + (1.0/i);
		      }
		 
		      System.out.println(sum);
		}

}

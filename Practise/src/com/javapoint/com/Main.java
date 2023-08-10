package com.javapoint.com;

import java.io.IOException;

/*
 * Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -5 + 8 * 6;
		double b = ((55 + 9) % 9);
		double c = 20 + (-3*5) /8;
		double d = 5 + 15 / 3 * 2  - 8 % 3;
		
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n");
		
		try {
			int sum = 0;
			String stringMinus = "1";
			int multiply = 1;
			String stringDivide = "1";
			String stringMode = "5";
			
			int [] array = new int[3];
			
			array[0] = 125;
			array[1] = 24;
			
			int minus = Integer.parseInt(stringMinus);
			double divide = Double.parseDouble(stringDivide);
			double mode = Double.parseDouble(stringMode);
			
			for(int i=0; i < array.length; i++) {
				sum = Math.addExact(array[0], array[1]);
				minus = (int) Math.subtractExact(array[0],array[1]);	
				multiply = Math.multiplyExact(array[0], array[1]);
				divide = (int) array[0] / array[1];
				mode = (double) array[0] % array[1];
			}
			
			System.out.println(array[0] + "+" + array[1] + "=" + sum);
			System.out.println(array[0] + "-" + array[1] + "=" + minus);
			System.out.println(array[0] + "*" + array[1] + "=" + multiply);
			System.out.println(array[0] + "/" + array[1] + "=" + divide);
			System.out.println(array[0] + "%" + array[1] + "=" + mode);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}

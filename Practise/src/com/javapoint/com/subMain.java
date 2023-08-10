package com.javapoint.com;

public class subMain {
	
	
	public static void getCalculation(double radius) {
		
		//formula for the parameter of a circle
		double parameter = 2 * Math.PI * radius;
		//formula for the area of the circle
		double area = Math.PI * (radius * radius);
		
		System.out.println("The parameter of the circle is " + parameter);
		System.out.println("The area of the circle is " + area);
		
	}

	
	public static void getSum(int a, int b) {
		
		int c = a + b;
		System.out.println("the sum is " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		getCalculation(7.5);
		
	}

}

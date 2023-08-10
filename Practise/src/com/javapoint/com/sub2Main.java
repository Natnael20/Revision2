package com.javapoint.com;

public class sub2Main {
	
	public static void getAverage(int[] array) {
		
		int sum = 0;

		int average = 0;
		
		for(int value : array) 
			System.out.println(value);
		
		for(int i=0; i < array.length; i++) {
		  sum += array[i] / array.length;
		  average = sum;
		}
		
		System.out.println("The average is " + average);
		
	}
	
	public static String getCalculation2(double height, double width) {
		
		double area = height * width;
		double parameter = 2 * (height + width);
		
		return area + "\n" + parameter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10,20,30,40,50};
		
		getAverage(array);
		
		System.out.println(getCalculation2(5.6,8.5));
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

		
	}

}

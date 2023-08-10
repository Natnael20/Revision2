package com.javapoint.com;

import java.util.Arrays;

public class array {
	
	public static void temperatureConversion(double Fahrenheit) {
		
		double celcius = (int) ((Fahrenheit - 32) * 5/9);
		
		System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + celcius +" in Celsius.");
		
	}
	
	public static void measurementConversion(double inch) {
		
		double meter = inch * 0.0254;
		System.out.println("From inch to meter is " + meter);
		
	}
	
	public static void mintoyearsandtodays(double min) {
		
		int year = (int) (min * (1.9013 * Math.pow(10, -6)));
		int days = (int) min / 1440;
		
		System.out.println(min + " minutes is approximately " + year + " years and " + days + " days");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temperatureConversion(220.0);
		measurementConversion(1000.0);
		mintoyearsandtodays(3456789);
	}
}

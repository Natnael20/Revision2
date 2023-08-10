package com.javapoint.com;
import java.util.*;

public class sub3main {
	
	  public static int[] generateArray() {
	        int[] numbers = { 1, 2, 3, 4, 5 };
	        return numbers;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Integer arr[] = new Integer[] {1, 4, 17, 7, 25, 3, 100};

		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		double average = sum / arr.length;
		
		System.out.println("The average of the said array is " + average);
     
        for(int j=0; j < arr.length; j++) {
        	if(arr[j] > average) {
        		System.out.println(arr[j]);
        	}
        }
        
        int[] resultArray = generateArray();
        System.out.println("Generated array: " + Arrays.toString(resultArray));
		
		
		
	}

}

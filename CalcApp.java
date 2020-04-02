package lesson8;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		//local variables
		
		int numbers[];
		int size;
		
		//create an object of type AvgMaxMin
		AvgMaxMin avgMaxMin = new AvgMaxMin();
		
		//input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter the size of an array!");
		size = input.nextInt();
		
		//create new array with the size provided by the user
		numbers = new int[size];
		
		//user will enter a new number as many times as indicated in the "size" and 
		//each of those numbers will be stored at a corresponding index in numbers[] array
		for(int i = 0; i < size; i++) {
			System.out.println("Please, enter a number!");
			numbers[i] = input.nextInt();
		}
		
		//processing
		avgMaxMin.setNumbers(numbers);
		avgMaxMin.calculateAvg();
		avgMaxMin.calculateMax();
		avgMaxMin.calculateMin();
		
	
		//output
		double avg = avgMaxMin.getAvg();
		int max = avgMaxMin.getMax();
		int min = avgMaxMin.getMin();
		
		System.out.println("The average number is: " + avg);
		System.out.println("The maximum number is: " + max);
		System.out.println("The min number is: " + min);
		
	}//end main

}//end class

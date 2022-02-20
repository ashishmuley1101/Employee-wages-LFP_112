package com.bridgelab.pratice;

public class IsPresentOrAbsent {
	
	public static void main(String[] args) {
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int PRESENT_NUMBER_RANGE = 3;
		final int WORKING_HOURS = 8;
		final int WAGE_PER_HOUR = 30;
		
		int isPresent = (int) Math.floor(Math.random()* PRESENT_NUMBER_RANGE);
		// System.out.println(isPresent);
		int empWage;
		if(isPresent==PRESENT){
			
			System.out.println("Employee Working for Full Time");
			 empWage = WORKING_HOURS * WAGE_PER_HOUR;
			
		} else if(isPresent == PART_TIME ) {
			
			System.out.println("Employee Working for Part Time");
			empWage = WORKING_HOURS * (WAGE_PER_HOUR/2);
			
			
		} else {
			
			System.out.println("Employee is Absent");
			empWage = 0;

		}
		
	
		System.out.println("Employee Wage :$ " +empWage+ " USD");
	}

}

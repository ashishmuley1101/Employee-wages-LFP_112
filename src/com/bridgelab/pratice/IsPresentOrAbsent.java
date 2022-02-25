package com.bridgelab.pratice;

public class IsPresentOrAbsent {
	
	public static void main(String[] args) {
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int PRESENT_NUMBER_RANGE = 3;
		final int WORKING_HOURS = 8;
		final int WAGE_PER_HOUR = 30;
		final int WORKING_MAX_DAY = 20;
		final int WORKING_MAX_HOURS = 100;
		
		int totalWorkingHour = 0;
		int totalWorkingday = 0;
		
		int empWage = 0;
		
		while(totalWorkingHour <= WORKING_MAX_HOURS && totalWorkingday < WORKING_MAX_DAY ) {
			
			totalWorkingday++;
		
			int isPresent = (int) Math.floor(Math.random()* PRESENT_NUMBER_RANGE);
			
			
			
			switch (isPresent) {
			case PRESENT :
				totalWorkingHour = totalWorkingHour + WORKING_HOURS;
			//	System.out.println("Employee Working for Full Time");
			//	 empWage = WORKING_HOURS * WAGE_PER_HOUR;
				break;
				
			case PART_TIME :
				totalWorkingHour = totalWorkingHour + (WORKING_HOURS/2);

				//System.out.println("Employee Working for Part Time");
				//empWage = WORKING_HOURS * (WAGE_PER_HOUR/2);
				break;
				
			default :
				//System.out.println("Employee is Absent");
				empWage = 0;
				break;
			}
		
			//System.out.println("Day : "+day+ " Employee Wage :$ " +empWage+ " USD");
		}
		double salary = totalWorkingHour * WAGE_PER_HOUR;
		System.out.println("Employee Monthly Wage : $" +salary+ " USD (Total Working Hours : " + totalWorkingHour + ")"  );
		
	}	
}	

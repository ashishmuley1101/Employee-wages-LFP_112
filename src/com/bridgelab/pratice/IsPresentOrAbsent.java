package com.bridgelab.pratice;

public class IsPresentOrAbsent {
	
	public static void main(String[] args) {
		final int PRESENT = 1;
		final int DIV = 2;
		
		int isPresent = (int) Math.floor(Math.random()* DIV);
		System.out.println(isPresent);
		if(isPresent==PRESENT){
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}

package com.learning.interfaces;

public class ValueOfNumber implements MyInterface{

	public void print(int num) {
		
		System.out.println("Value of a number is : "+num);
	}
	
	public static void main(String args[]){
		
		ValueOfNumber obj = new ValueOfNumber();
		
		obj.print(10);
		
	}
	
}

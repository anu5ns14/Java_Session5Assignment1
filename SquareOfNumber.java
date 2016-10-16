package com.learning.interfaces;

import java.util.Scanner;

public class SquareOfNumber implements MyInterface {

	@Override
	public void print(int num) {
		
		int square = num*num;
		System.out.println("Square of a number is: "+square);
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scan.nextInt();
		SquareOfNumber obj = new SquareOfNumber();
		obj.print(num);
	}
	
}

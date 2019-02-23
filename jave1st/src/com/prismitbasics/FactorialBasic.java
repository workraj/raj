package com.prismitbasics;

public class FactorialBasic {

	public static void main(String[] args) {
		int number = 5;
		int factorial = number;
		for (int i= (number - 1); i > 1; i--){
			factorial = factorial* i;
		}
		System.out.println("factorial no is" + factorial);
	}
}

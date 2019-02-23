package com.prismitbasic5;
/*
 * finding the prime number
 * @raj version 1.7 
 * */
public class PrimeNumber {

	public static void main(String[] args) {
		int input = 17;
		int count = 0;
		for (int i=1;i<=input;i++) {
			if (input % i==0) {
				count++;				
			}
		}if (count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}
}

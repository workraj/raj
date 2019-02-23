package com.prismitbasic4;

public class PrimeNumber {
/*
 * finding the prime number
 * @raj version 1.7
 * */
	public static void main(String[] args) {
		System.out.println("checking its prime number or not");
		int num =17;
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num %i==0) {
				count++;
			}
			if (count == 2) {
				System.out.println("number is prime");}
			
				else 
				{
					System.out.println("number is not prime");
				}
			}
		}
		

	}



package com.prismitbasic5;

public class PrimeNumber1 {
/*
 * finding the prime number
 * @raj version 1.7
 * */
	public static void main(String[] args) {
		int num = 12;
		int count = 0;
		
		for (int i=1;i<=num;i++){
			count= 0;
		for (int j=1; j<=i;j++) { 
				if (count >2) {
				break;
			}
				if(i % j==0) {// checking the module 
					count++;
				}
		} 
		// checking the count is equal to 2
				if (count==2) {
					System.out.println(" prime numbers are "+i);
			}
		}
	}
}




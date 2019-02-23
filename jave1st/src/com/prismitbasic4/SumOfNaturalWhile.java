package com.prismitbasic4;

public class SumOfNaturalWhile {

	public static void main(String[] args) {
		int num = 100;
		int i =1 ;
		int sum = 0;
		while(i<=num) {
			sum +=i;
			i++;
		}
        System.out.println("sum of natural number"+sum);
	}

}

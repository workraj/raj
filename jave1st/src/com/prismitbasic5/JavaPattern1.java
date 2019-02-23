package com.prismitbasic5;
/*
 * checking the patterns 
 * @raj version 1.7
 * */
public class JavaPattern1 {

	public static void main(String[] args) {
		// entering the number value
		int num = 7;
		//checking the check is greater than equal to num 
		for(int check=0;check<=num;check++) {
			// checking the check1 is greater than equal to check
			for(int check1=0 ;check1<= check;check1++) {
				 System.out.print(" "+check1);//printing the value of check1
			}
		//going to the nextline and going back to for loop
		System.out.println("");
		}
	}

}

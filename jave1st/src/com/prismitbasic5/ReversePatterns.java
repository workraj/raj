package com.prismitbasic5;

public class ReversePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		for(int check=0;check<=num;check ++) {
			for(int check1 = num;check1>=check;check1--) {
				System.out.print(""+check1);
			}
			System.out.println("");
		}

	}

}

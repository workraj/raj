package com.prismbasic6;

public class JavaPattern4 {

	public static void main(String[] args) {
		int num = 7;
		for(int check =0; check<=num;check++) {
			for(int check1=0;check1<=check;check1++) {
				System.out.print(""+check1);
			}
		
		System.out.println("");
	}
		for(int check3=0;check3>=num;check3--) {
			for(int check4=num;check4<=check3;check4++) {
				System.out.print(""+check4);
			}
			System.out.println("");
		}
	}

}

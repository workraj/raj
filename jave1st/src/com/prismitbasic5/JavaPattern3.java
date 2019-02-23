package com.prismitbasic5;

public class JavaPattern3 {

	public static void main(String[] args) {
		int num = 7;
		for(int check=0;check>=num;check--) {
			for(int check1=0;check1>=check;check1++) {
				System.out.println(""+check1);
			}
		}System.out.println("");
	}

}

package com.prismitbasic5;

public class JavaPattern7 {

	public static void main(String[] args) {
         int num= 8;
         for(int check=1;check<=num;check++) {
        	 for (int check1=num;check1>=check;check--) {
        		 System.out.print("");
        	 }
        	 for(int check2=1;check2<=check;check2++) {
        		 System.out.print(""+check2);
        	 }
        	 for(int check3=2;check3<=check;check3++) {
        		 System.out.print(""+check3);
        	 }
         System.out.println("");
         }
	}

}

package com.prismbasic6;
/*
 * Resverse string
 * @raj version 1.7
 */
public class ReverseString3 {

	public static void main(String[] args) {
		// providing the string value
		String str ="javed";
		String str1="";
		for (int i =str.length()-1;i>=0;i--) {
			str1 =str1 + str.charAt(i);
		}
		System.out.println(str1);// printing the str1 value
		

	}

}

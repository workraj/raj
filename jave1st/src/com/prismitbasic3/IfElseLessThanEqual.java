package com.prismitbasic3;

public class IfElseLessThanEqual {

	public static void main(String[] args) {
		int firstnumber = 31;
		int secondnumber = 35;
		int thirdnumber = 26;
		if (secondnumber <= firstnumber) {
			System.out.println("secondnumber is less than firstnumber");
		}
		else if (thirdnumber <= secondnumber) {
			System.out.println("thirdnumber is less than secondnumber");
		}
		else if (thirdnumber<= firstnumber) {
			System.out.println("thirdnumber is less than firstnumber");
		
		}
		else {
			System.out.println("least number ");
		}
	}

}

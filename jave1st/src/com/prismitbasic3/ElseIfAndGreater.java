package com.prismitbasic3;

public class ElseIfAndGreater {

	public static void main(String[] args) {
		int firstnumber = 35;
		int secondnumber = 26;
		int thirdnumber = 36;
		if(secondnumber >= thirdnumber) {
			System.out.println("secondnumber is greater than thirdnumber");
		}
		else if (thirdnumber >= firstnumber) {
			System.out.println("thirdnumber is greater than firstnumber");
		}
		else if (thirdnumber >= secondnumber) {
			System.out.println("thirdnumber is greater than secondnumber");
		}
	}

}

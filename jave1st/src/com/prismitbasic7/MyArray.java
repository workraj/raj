package com.prismitbasic7;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		//
		int[] my_array = { 25, 14, 56, 77, 34, 49 };
		System.out.println("before removing second element"+ Arrays.toString(my_array));

		//System.out.println(my_array.length);
		int beforeRemoveIndex = 1;
		for (int i = beforeRemoveIndex; i < my_array.length - 1; i++) {
			my_array[i] = my_array[i + 1];
		}
		int afterRemoveIndex = 1;
		System.out.println("after removing second element" + Arrays.toString(my_array));

	}

}

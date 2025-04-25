package com.sb;

public class StringBufferExample4 {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Rudhra Narasimha");

		name.reverse();

		System.out.println(name);

		System.out.println();

		StringBuffer word = new StringBuffer("malayalam");
		String originalword = word.toString(); // to string method is used to convert the stringbuffer to string
		String reverseword = word.toString();

		if (originalword.equals(reverseword)) {

			System.out.println("Palindrome");
		}

	}

}

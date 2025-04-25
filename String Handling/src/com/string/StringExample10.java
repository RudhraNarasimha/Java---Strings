package com.string;

public class StringExample10 {

	public static void main(String[] args) {

		String str = "Java is Object Oriented, Object is an Instance of Class";

		String arr[] = str.split(" ");

		int count = 0;

		for (String word : arr) {

			if (str.indexOf(word) == str.lastIndexOf(word)) {

				System.out.println(word);
				count++;

			}

//			System.out.println(word);
		}

		System.out.println();

		System.out.println(count);
	}

}

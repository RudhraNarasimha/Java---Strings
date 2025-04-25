package com.string;

public class StringExample3 {

	public static void main(String[] args) {

		// Literals
		String name1 = "Codegnan"; // String Literal

		String name2 = "Codegnan"; // String Literal

		System.out.println(name1.equals(name2)); // It Check the Content in String Constant Pool
		System.out.println(name1 == name2); // It Check the Memory Location in String Constant Pool
		// Class

		String name3 = new String("IT Solutions");
		String name4 = new String("IT Solutions");
		System.out.println(name3.equals(name4)); // String Class Object It Check the Memory Location

		System.out.println(name3 == name4); // String Class Object It Checks the Memory Location

	}

}

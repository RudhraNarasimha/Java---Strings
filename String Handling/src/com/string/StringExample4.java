package com.string;

public class StringExample4 {

	public static void main(String[] args) {

		// Literals
		String email1 = "ANAND@CODEGNAN.COM"; // String Literal

		String email2 = "anand@codegnan.com"; // String Literal

		System.out.println(email1.equals(email2));
		System.out.println(email1.equalsIgnoreCase(email2)); // It Check the Content in String Constant Pool

		String email3 = new String("PAVAN@CODEGNAN.COM");
		String email4 = new String("pavan@codegnan.com");

		System.out.println(email3.equals(email4)); // String Class Object It Check the Memory Location
		System.out.println(email3.equalsIgnoreCase(email4));

	}

}

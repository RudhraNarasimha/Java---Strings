package com.string;

public class StringExample5 {

	public static void main(String[] args) {

		// Literals
		String email1 = "ANAND@CODEGNAN.COM"; // Literal

		String email2 = "anand@codegnan.com"; // Literal

		System.out.println(email1.compareTo(email2));
		System.out.println(email1.compareToIgnoreCase(email2));

		String email3 = new String("PAVAN@CODEGNAN.COM");
		String email4 = new String("pavan@codegnan.com");

		System.out.println(email3.compareTo(email4)); // It Calculate the ASCII Value and return the Value
		System.out.println(email3.compareToIgnoreCase(email4)); // Here it Equals because, It Ignores the Case Senstive

	}

}

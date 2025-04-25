package com.string;

public class StringExample6 {

	public static void main(String[] args) {

		// Contains method is used to Check whether the given sub string is present in
		// the main string or not

		String subject = "Web Technologies";

		System.out.println(subject.contains("olo")); // True
		System.out.println(subject.contains("Web")); // True
		System.out.println(subject.contains("web")); // False

	}

}

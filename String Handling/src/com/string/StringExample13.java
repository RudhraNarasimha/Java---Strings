package com.string;

public class StringExample13 {

	public static void main(String[] args) {

		String subject[] = { "Web Technologies", "Web Programming", "Operating Systems", "Realtime Systems" };

		for (String x : subject) {
			System.out.println(x);
		}

		System.out.println("=========================Subject Starts with Web=======================");

		for (String x : subject) {
			if (x.startsWith("Web")) {
				System.out.println(x);
			}
		}

		System.out.println("=========================Subject Ends with Systems=====================");
		for (String x : subject) {
			if (x.endsWith("Systems")) {
				System.out.println(x);
			}
		}

	}
}

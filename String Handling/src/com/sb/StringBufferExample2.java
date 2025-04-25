package com.sb;

public class StringBufferExample2 {

	public static void main(String[] args) {

		StringBuffer name1 = new StringBuffer("Rudhraa Narasiimha");

		name1.deleteCharAt(5);

		name1.deleteCharAt(12);

		System.out.println(name1);

	}

}

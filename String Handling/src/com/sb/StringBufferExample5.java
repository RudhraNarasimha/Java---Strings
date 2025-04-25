package com.sb;

public class StringBufferExample5 {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Narasimha Narasimha");

		name.replace(0, 9, "Rudhra");

		System.out.println(name);

	}

}

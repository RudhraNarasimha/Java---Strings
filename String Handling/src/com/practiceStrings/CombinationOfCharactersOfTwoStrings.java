package com.practiceStrings;

public class CombinationOfCharactersOfTwoStrings {

	public static void combinedTwoStrings(String input1, String input2) {

		StringBuffer combinedString = new StringBuffer();

		char arr1[] = input1.toCharArray();

		char arr2[] = input2.toCharArray();
		
		
		
		

		int maxlength = input1.length() > input2.length() ? input1.length() : input2.length();

		for (int i = 0; i < maxlength; i++) {

			if (i < arr1.length) {

				combinedString.append(arr1[i]);

			}

			if (i < arr2.length) {

				combinedString.append(arr2[i]);

			}

		}

		System.out.println(combinedString);
	}
	
	
	
	
	
	public static void main(String[] args) {

		combinedTwoStrings("Codegnan", "IT Solutions");
		combinedTwoStrings("Rudhra", "Narasimha");

	}

}

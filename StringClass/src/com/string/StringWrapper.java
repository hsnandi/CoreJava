package com.string;

public class StringWrapper {
	public static void main(String[] args) {
		String str = " Shelu 410101, GVAIET college.";

		String str1 = " Shelu 410101, GVAIET college.";

		char[] strArray = str.toCharArray();

		if (str.equals(str1))
			System.out.print("Both objects are equal: ");
		else
			System.out.print("Both objects are not equal: ");

		System.out.println(str.compareTo(str1));

		System.out.println(str1.substring(5, 10));

		if (str.equalsIgnoreCase(str1))
			System.out.println("Ignore Case");
	}
}

package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String name = "ABC";
		String name1 = "ABC";

		String name2 = new String("ABC");

		if (name1.equals(name2)) {
			System.out.println("name1 & name2:" + true);
		}
		if (name.equals(name1)) {
			System.out.println("name & name1:" + true);
		}

		// String Buffer is thread safe.
		StringBuffer strBuffer = new StringBuffer();
		System.out.println(strBuffer.capacity()); // TO check capacity of String buffer and string builder. Capacity is
													// always 16.

		StringBuilder strBuilder = new StringBuilder();
		System.out.println(strBuilder.capacity());

		StringBuilder strBuilder1 = new StringBuilder("Ramu");
		System.out.println(strBuilder1.capacity()); // Here the capacity would be 20, because 4 more character are
													// added.
		System.out.println(strBuilder1.length()); // To get length of String i.e total character
		System.out.println(strBuilder1.reverse()); // To reverse the string

		System.out.println(strBuilder1.append(" bin laden")); // The last string which got reversed, would be
																// append(ADD) with string added in statement
		System.out.println(strBuilder1.append(" Pakistan"));

		System.err.println(strBuilder1.insert(4, ": ")); // To insert character. first position index and then,
															// character to be added.

		// toString Method;
		String name3 = strBuilder.toString();

		// equals
		StringBuilder strBuilder5 = new StringBuilder("Hafees Said");
		if (strBuilder5.equals(strBuilder5))
			System.out.println("Both are equal");
		else
			System.out.println("Both are unequal");

		// To compare
		if (strBuilder.compareTo(strBuilder5) < 0)
			System.out.println("Object is alphabetically smaller");

	}
}
//javadoc to study class of string.
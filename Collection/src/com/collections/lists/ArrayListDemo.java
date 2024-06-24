package com.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList = new ArrayList<>();

		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
//      intArrayList.add("hfowihfoi"); // This would cause a compilation error, since only integer values can be added.
		intArrayList.add(4);
		intArrayList.add(5);
		System.out.println(intArrayList);

		List<String> stringList = new ArrayList<>();

		stringList.add("ABC");
		stringList.add("BBC");
		stringList.add("CBC");
		stringList.add("ABB");
		stringList.add("ACC");
		System.out.println(stringList.toString());
		System.out.println(stringList); // Both are same.

		// Traditional for loop
		for (int i = 0; i < stringList.size(); i++) {
			// String element = stringList.get(i);
			System.out.println(stringList.get(i));
		}

		// Advance for loop
		for (int number : intArrayList) {
			System.out.println(number);
		}

		// For each method
		stringList.forEach(System.out::println);
		stringList.forEach(System.out::println);

		// Stream API
		intArrayList.stream().forEach(System.out::println);
		intArrayList.stream().map(Integer::toBinaryString).forEach(System.out::println);

		// Iterator cursor
		Iterator<Integer> intIterator = intArrayList.iterator();
		while (intIterator.hasNext()) {
			System.out.println(intIterator.next());
		}

	}
}

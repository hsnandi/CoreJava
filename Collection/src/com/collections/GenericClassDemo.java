package com.collections;

public class GenericClassDemo {

	public static void main(String[] args) {
		add(10, 20);
		add(11, 24);
		add(16, 27);
		add(52, 31);
		add(17, 23);

		Generic1 generic1 = new Generic1("ABC");
		Generic2 generic2 = new Generic2(10);
		System.out.println(generic1.getName());
		System.out.println(generic2.getNumber());

		Generic<String> stringGeneric = new Generic<>("Hello");
		System.out.println(stringGeneric.getH());

		Generic<Integer> intGeneric = new Generic<>(1);
		System.out.println(intGeneric.getH());
	}

	public static void add(int number1, int number2) {
		System.out.println(number1 + number2);
	}
}

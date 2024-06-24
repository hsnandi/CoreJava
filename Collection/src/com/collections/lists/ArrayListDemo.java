package com.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
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
        System.out.println(stringList);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        for (int number : intArrayList) {
            System.out.println(number);
        }

        stringList.forEach(System.out::println);
        stringList.forEach(System.out::println);

        intArrayList.stream().forEach(System.out::println);
        intArrayList.stream().map(Integer::toBinaryString).forEach(System.out::println);

        Iterator<Integer> intIterator = intArrayList.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        intArrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        int[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        int index = intArrayList.indexOf(10);
        System.out.println(index);

        List<Integer> subList = intArrayList.subList(5, 10);
        System.out.println(subList);

        List<Integer> intLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            intLinkedList.add(i);
        }
        System.out.println(intLinkedList);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}

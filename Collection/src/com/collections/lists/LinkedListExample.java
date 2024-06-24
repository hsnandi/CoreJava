package com.collections.lists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        
        intLinkedList.add(10);
        
        intLinkedList.add(1, 12); 
        System.out.println(intLinkedList);
        
        intLinkedList.addAll(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19)); 
        System.out.println(intLinkedList);
        
        intLinkedList.remove(6);
        intLinkedList.remove(Integer.valueOf(10));
        
        intLinkedList.get(10);
        boolean isContains= intLinkedList.contains(25);
        System.out.println(isContains);
        
        
    }
}

package com.java.collections.interfaces;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        fruits.add(2, "Watermelon");
        System.out.println("After adding Watermelon at position 2 ==> " + fruits);
        fruits.addFirst("Strawberry");
        System.out.println("After adding Strawberry at first ==> " + fruits);
        fruits.addFirst("Peach");
        System.out.println("After adding Peach at last ==> " + fruits);

        System.out.println("Get first element in linked list ==> " + fruits.getFirst());
        System.out.println("Get last element in linked list ==> " + fruits.getLast());
        System.out.println("Get element at index x in linked list ==> " + fruits.get(2));
    }
}

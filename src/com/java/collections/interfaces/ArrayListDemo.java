package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(20);
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Peach");

        System.out.println(fruits);

        List<Integer> primes1 = new ArrayList<>();
        primes1.add(2);
        primes1.add(3);
        primes1.add(5);
        primes1.add(7);
        primes1.add(11);

        List<Integer> primes2 = new ArrayList<>(primes1);
        primes2.add(13);
        primes2.add(17);
        System.out.println(primes1);
        System.out.println(primes2);

        List<Integer> primes3 = new ArrayList<>();
        primes3.add(19);
        primes3.add(23);
        primes3.add(27);

        primes3.addAll(primes2);
        System.out.println(primes3);
        System.out.println("Size of array is " + primes3.size());

        // Basic For loop
        for (int i = 0; i < primes3.size(); i++) {
            System.out.println(primes3.get(i));
        }

        // Enhanced For each loop
        for (Integer number: primes3) {
            System.out.println(number);
        }

        // Basic loop with iterator
        for (Iterator<Integer> iterator = primes3.iterator(); iterator.hasNext();) {
            int number = iterator.next();
            System.out.println(number);
        }

        // Iterator with while loop
        Iterator<Integer> iterator = primes3.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        // java 8 stream with lambda
        primes3.stream().forEach(number -> System.out.println(number));

        // java 8 stream with lambda smaller
        primes3.stream().forEach(System.out::println);

        // java 8 forEach with lambda
        primes3.forEach(number -> System.out.println(number));
    }
}

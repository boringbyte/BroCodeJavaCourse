package com.java.collections.interfaces;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(50);

        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List in ascending order: " + list);
        Collections.reverse(list);
        System.out.println("Sorted list in descending order: " + list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        System.out.println(employees);
//        Collections.sort(employees, new MySort());
//        System.out.println(employees);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });

        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
//        Collections.sort(employees, Comparator.comparing(Employee::getName)); // Same as above
        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary()); // swap o1 with o2 for descending order
    }
}
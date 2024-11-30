package com.example;

import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        // Обработка списка, включающего четные числа
        List<Integer> numbersIncludingEven = Arrays.asList(10, 24, 3, 12, 5, 16, 27, 38, 9, 86);
        System.out.println();
        System.out.println("List Of Numbers: " + numbersIncludingEven);

        numbersIncludingEven.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(
                        (average)
                                -> System.out.println("Average value even numbers is present, this is -> " +
                                        average),
                        ()
                                -> System.out.println("Average value even numbers is empty.")
                );


        // Обработка списка, без четных чисел
        List<Integer> numbersWithoutEven = Arrays.asList(1, 11, 23, 13, 5, 37, 7, 19, 69, 21);
        System.out.println();
        System.out.println("List Of Numbers: " + numbersWithoutEven);

        numbersWithoutEven.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(
                        (average)
                                -> System.out.println("Average value even numbers is present, this is: " +
                                        average),
                        ()
                                -> System.out.println("Average value even numbers is empty.")
                );
    }

}

package org.example.sample;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {

    public static boolean isNumberEven(int number){
        return number % 2 ==0;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> response = numbers.stream().filter(MethodReferences::isNumberEven)
                .collect(Collectors.toList());
        response.stream().forEach(System.out::println);
    }
}

package org.example.streamCreation;

import java.util.Arrays;
import java.util.List;

public class StreamCreation {


    public static void main(String[] args) {
        System.out.println("Hello world");
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers.stream());
        int[] array = {1,2,3,4};
        System.out.println(Arrays.stream(array));
    }
}

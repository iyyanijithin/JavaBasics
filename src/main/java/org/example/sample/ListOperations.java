package org.example.sample;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {



        List<Integer> numbers = List.of(1,2,3,4,5);
        //print all the number
        numbers.stream().forEach(System.out::println);

        //print all even number
        numbers.stream().filter(val-> val %2 ==0).forEach(System.out::println);

        //print all odd number
        numbers.stream().filter(val-> val %2 !=0).forEach(System.out::println);

        //find number of numbers
        System.out.println(numbers.stream().reduce(0,(val,val2)->{
            return val + val2;
        }).intValue());
        
        //convert the list to its square
        List<Integer> squreOfNumbers = numbers.stream().map(val -> val * val).collect(Collectors.toList());
        squreOfNumbers.stream().forEach(System.out::println);

        //take a list filter and get the length of that word
        System.out.println("Printing results");
        List<String> names = List.of("One","Two","Three");
        names.stream().filter(val-> val.equalsIgnoreCase("one"))
                .map(val-> val.length()).forEach(System.out::println);

        //remove element from the list
        List<String> modifiable = new ArrayList<>(names);
        modifiable.removeIf(val -> val.equals("One"));
        modifiable.stream().forEach(System.out::println);


        //replace all the elements of list
        modifiable = new ArrayList<>(names);
        modifiable.replaceAll(val-> val.toUpperCase());
        modifiable.stream().forEach(System.out::println);
    }
}

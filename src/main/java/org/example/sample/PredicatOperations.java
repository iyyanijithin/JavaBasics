package org.example.sample;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatOperations {

    public static void main(String[] args) {
        System.out.println("Samples for Predicate");


        Predicate<Integer> p1 = (val)->{
            if(val % 2 ==0 ){
                return true;
            }else{
                return false;
            }
        };
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers.stream().filter(p1).collect(Collectors.toList()).size());

    }
}

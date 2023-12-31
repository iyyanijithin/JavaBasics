package org.example.sample;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionOperations {

    public static void main(String[] args) {
        System.out.println("Starting with function operations");
        Function<Integer,Integer> f1 = (val) ->{
          return val * val;
        };
        List<Integer> val = List.of(1,2,3,4,5,6);
        List<Integer> squaredList = val.stream().map(f1).collect(Collectors.toList());
        squaredList.stream().forEach(System.out::println);

        BiFunction <String,String,Integer> bf = (val1,val2)->{
            return val1.length() + val2.length();
        };
        System.out.println(bf.apply("hello","hello2"));
    }
}

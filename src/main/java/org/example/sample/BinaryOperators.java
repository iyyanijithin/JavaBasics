package org.example.sample;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperators {

    public static void main(String[] args) {
        System.out.println("Starting consumer operations");
        BinaryOperator<Integer> operator = Integer::sum;

        BinaryOperator<Integer> operator1 = (val,val2)->{
            return val * val + val2 * val2;
        };
        List<Integer> val = List.of(1,2,3,4,5);
        System.out.println(val.stream().reduce(0,operator).intValue());
        System.out.println(val.stream().reduce(0,operator1).intValue());

    }
}

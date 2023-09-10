package org.example.sample;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerOperations {

    public static void main(String[] args) {
        System.out.println("Starting consumer operations");
        Consumer<Integer> c1 = (val)->{
            System.out.println("I have consumed that value %s".formatted(val));
        };
        List<Integer> val = List.of(1,2,3,4,5);
        val.stream().forEach(c1);

        BiConsumer<String,Integer> bc = (val1,val2)->{
            System.out.println(val1.length() + val2);
        };
        bc.accept("s1",1);
    }
}

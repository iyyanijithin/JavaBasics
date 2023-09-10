package org.example.sample;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierOperator {

    public static void main(String[] args) {
        System.out.println("Supplier Operator");
        Supplier<Integer> supplier = ()-> { return new Random().nextInt();};
        System.out.println(supplier.get());
        }

        Supplier<String> s1 = String::new;
    }


package org.example.sample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameteriazation {

    public static List<Integer> processStream(List<Integer> list, Predicate<Integer> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> val = List.of(1,2,3,4,5);
        processStream(val,val1-> val1 %2 ==0);
        processStream(val,val1-> val1 %2 !=0);
    }
}

package org.example.custom;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxMin {

    public static void main(String[] args) {
        System.out.println("Samples which uses min/max");
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));


        Optional<Course> max = courses.stream().max(Comparator.comparing(Course::getNumberOfStudents));
        System.out.println(max);
        Optional<Course> min = courses.stream().min(Comparator.comparing(Course::getNumberOfStudents));
        System.out.println(min);

        System.out.println( courses.stream().findFirst());
        System.out.println( courses.stream().findAny());

    }
}

package org.example.custom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitOthers {

    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        //sort the list of courses based on number of students and get only top 5
        courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents))
                .limit(5).forEach(System.out::println);


        System.out.println("*************************************************");
        //get the course which has 2nd most number of students
        courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).skip(1).forEach(System.out::println);

        System.out.println("*************************************************");
        courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents))
                .skip(1).limit(1).forEach(System.out::println);
        System.out.println("*************************************************");
        List<Course> collect = courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("*************************************************");
        List<Course> collects = courses.stream().dropWhile(course -> course.getReviewScore() >= 95)
                .collect(Collectors.toList());
        System.out.println(collects);


    }
}

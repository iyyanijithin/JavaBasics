package org.example.custom;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Starting***********");
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));



        //Answer the following questions:
        //get the couse on spring boot
        Course springBootCourse = courses.stream().filter(course -> course.getName().equalsIgnoreCase("Spring Boot"))
                .findFirst().orElse(null);
        System.out.println(springBootCourse);

        //get me all the courses which have review score more than 90

        List<Course> coursesGreaterThan90 = courses.stream()
                .filter(course -> course.getReviewScore() > 90).collect(Collectors.toList());
        System.out.println(coursesGreaterThan90);


        //Section for anymatch, allmatch and none match
        //see if all the courses have score of 90 and above
        boolean b = courses.stream().allMatch(course -> course.getReviewScore() > 97);
        System.out.println("All the courses are above : " +b);

        //see if none of courses are less than 50
        boolean b1 = courses.stream().noneMatch(course -> course.getReviewScore() < 50);
        System.out.println(b1);

        boolean b2 = courses.stream().anyMatch(course -> course.getReviewScore() == 50);
        System.out.println(b2);


    }

}

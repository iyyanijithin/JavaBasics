package org.example.custom;

import java.util.List;

public class SumAvgCount {

    public static void main(String[] args) {
        System.out.println("Samples for sum avg and count");

        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));


        System.out.println(courses.stream().mapToInt(course -> course.getNumberOfStudents()).sum());
        System.out.println(courses.stream().mapToInt(course -> course.getNumberOfStudents()).count());
        System.out.println(courses.stream().mapToInt(course -> course.getNumberOfStudents()).sum());
        System.out.println(courses.stream().mapToInt(course -> course.getNumberOfStudents()).max());
    }
}

package org.example.custom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortingUsingLamda {

    public static void main(String[] args) {
        System.out.println("Sorting using lamda");

        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        //sort the courses by number of students
        Comparator<Course> byNumberOfStudents = Comparator.comparing(Course::getNumberOfStudents);
        Stream<Course> sortedByStudents = courses.stream().sorted(byNumberOfStudents);
        sortedByStudents.forEach(System.out::println);

        //sort by number of students by reverse
        System.out.println("**************************************************************");
        Comparator<Course> reversed = Comparator.comparing(Course::getNumberOfStudents).reversed();
        courses.stream().sorted(reversed).forEach(System.out::println);


        //sort by 2 attributes
        System.out.println("**************************************************************");
        Comparator<Course> reversed1 = Comparator.comparing(Course::getNumberOfStudents).thenComparing(Course::getReviewScore).reversed();
        courses.stream().sorted(reversed1).forEach(System.out::println);
    }
}

package org.example.custom;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

    private String name;
    private String category;
    private int reviewScore;
    private int numberOfStudents;

}

package org.example.sample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileOperations {

    public static void main(String[] args) throws Exception {
        System.out.println("Performing file operations");
        Files.lines(Path.of("data.txt")).forEach(System.out::println);


        Files.lines(Path.of("data.txt")).forEach(System.out::println);
    }
}

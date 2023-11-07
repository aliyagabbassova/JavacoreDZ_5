package org.example;

import java.io.PrintStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class Main {
        public static void main(String[] args) {

            List<Student> students = new ArrayList<>();

            students.add(new Student("Петров", new double[]{5, 5, 5, 5}, "Информатика"));
            students.add(new Student("Иваанов", new double[]{5, 4, 5, 5}, "Информатика"));
            students.add(new Student("Сидоров", new double[]{5, 5, 5, 5}, "Информатика"));
            students.add(new Student("Гончаров", new double[]{5, 5, 5, 5}, "Информатика"));
            students.add(new Student("Петров", new double[]{5, 5, 5, 5}, "Математика"));
            students.add(new Student("Козлов", new double[]{5, 4, 5, 4}, "Математика"));
            students.add(new Student("Киров", new double[]{5, 4, 5, 5}, "Информатика"));

            testStringsCollection(students);
        }

        public static void testStringsCollection(List<Student> students) {


            List<Student> result = students.stream()
                    .filter(student -> student.getSpecialty().equals("Информатика"))
                    .filter(student -> student.getAverageGrade().doubleValue()>4.5)
                    .limit(5)
                    .sorted((o1, o2) -> o2.getAverageGrade().compareTo(o1.getAverageGrade()))
                    .collect(Collectors.toList());


            System.out.println(result);

        }

    }

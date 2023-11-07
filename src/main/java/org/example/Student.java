package org.example;
import java.awt.geom.Arc2D;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

    public class Student {
        private String name;
        private  double[] marks;
        private String specialty;

        public Student(String name, double[] marks, String specialty) {
            this.name = name;
            this.marks = marks;
            this.specialty = specialty;
        }

        public String getName() {
            return name;
        }

        public double[] getMarks() {
            return marks;
        }

        public String getSpecialty() {
            return specialty;
        }

        public Double getAverageGrade(){

            Double doubleStream = Arrays.stream(marks).average().getAsDouble();
            return doubleStream;
        }



        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + Arrays.toString(marks) +
                    ", specialty='" + specialty + '\'' +
                    '}'+getAverageGrade();
        }
    }




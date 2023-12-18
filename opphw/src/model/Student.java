package model;
import java.util.Arrays;

public class Student {
    String name;
    int age;
    int[] marks;
    char grade;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        calculateGrade();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
        calculateGrade();
    }

    public char getGrade() {
        return grade;
    }

    public void calculateGrade() {
        int totalMarks = Arrays.stream(marks).sum();
        int averageMarks = totalMarks / marks.length;

        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayResults() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Result: " + getResult());
        System.out.println();
    }

    public double calculatePercentage() {
        int totalMarks = Arrays.stream(marks).sum();
        return (double) totalMarks / marks.length;
    }

    public String getResult() {
        return (grade == 'F') ? "Fail" : "Pass";
    }

}

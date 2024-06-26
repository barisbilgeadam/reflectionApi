package com.barisd.orn01_Class;

public class Student {
    private String studentName;
    private int grade;

    public Student(String studentName, int grade) {
        this.studentName = studentName;
        this.grade = grade;
    }

    public Student() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

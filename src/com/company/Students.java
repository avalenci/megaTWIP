package com.company;

public class Students {
    public Students(String name, int numb) {
        studentName = name;
        secretNumber = numb;
    }
    public int getSecretNumber() {
        return secretNumber;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setQ1Grade(int numb) {

    }
    int secretNumber;
    String studentName;
    int totalGrade;
    int q1Grade;
    int q2Grade;
}

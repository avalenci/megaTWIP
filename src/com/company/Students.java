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
    public void setGrades(double q1, double q2) {
        q1numb++;
        q2numb++;
        q1Grade += (int)(q1/q1numb);
        q2Grade += (int)(q2/q2numb);
        if (q2numb == 2) {
            totalGrade = (q1Grade + q2Grade)/2;
        }
    }
    private int secretNumber;
    private String studentName;
    public int totalGrade;
    public int q1Grade = 0;
    public int q2Grade = 0;
    private int q1numb = 0;
    private int q2numb = 0;
}

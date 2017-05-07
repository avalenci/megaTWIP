package com.company;

public class Students implements Comparable<Students>{
    Students(String name, int numb) {
        studentName = name;
        secretNumber = numb;
    }
    int getSecretNumber() {
        return secretNumber;
    }
    String getStudentName() {
        return studentName;
    }
    void setGrades(double q1, double q2) {
        qnumb++;
        q1Grade += (int)(q1/qnumb);
        q2Grade += (int)(q2/qnumb);
        totalGrade = ((q1Grade + q2Grade)/2);
    }
    public int compareTo(Students s)
    {
        if(studentName.compareTo(s.getStudentName()) > 0)
            return 1;
        else if(studentName.compareTo(s.getStudentName()) < 0)
            return -1;
        else
            return 0;
    }
    private int secretNumber;
    private String studentName;
    int totalGrade;
    int q1Grade = 0;
    int q2Grade = 0;
    private int qnumb = 0;
}

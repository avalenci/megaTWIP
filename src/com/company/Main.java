package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner names = new Scanner(new File("names.txt"));
        while (names.hasNext()) {
            String name = names.next();
            int numb = names.nextInt();
            student.add(new Students(name, numb));
        }
        Scanner rawData = new Scanner(new File("rawDataU6.txt"));
        ArrayList<String> lines = new ArrayList<>();
        rawData.nextLine();
        while (rawData.hasNext()) {
            lines.add(rawData.nextLine());
        }
        for (String x : lines) {
            Scanner s = new Scanner(x);
            s.useDelimiter("\t");
            Students a = findStudent(s.nextInt());
            double q1 = 0, q2 = 0;
            a.setGrades(q1, q2);
        }
        for (Students a: student) {
            //System.out.println(a.getSecretNumber() + " " + a.totalGrade + " " + a.q1Grade + " " + a.q2Grade);
        }
    }
    static Students findStudent(int numb) {
        for (Students x : student) {
            if (x.getSecretNumber() == numb)
                return x;
        }
        return null;
    }
    static double getGrade(String s) {
        double points = 0;
        return points;
    }
    static ArrayList<Students> student = new ArrayList<>();
}

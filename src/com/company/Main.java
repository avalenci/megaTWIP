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
            Scanner s = new Scanner(rawData.nextLine());
            s.useDelimiter("\t");
            Students a = findStudent(s.nextInt());
            double q1 = 0, q2 = 0;
            while (s.hasNext()) {
                double receive = getGrade(s.next());
                if (receive == .01 && !(s.hasNextInt()))
                    break;
                else if (receive < 0) {
                    q1 += receive;
                    break;
                }
                else if (receive != .01) {
                    q1 += receive;
                }
            }
            while (s.hasNext()) {
                double receive = getGrade(s.next());
                if (receive < 0) {
                    q2 += receive;
                    break;
                }
                else if (receive != .01) {
                    q2 += receive;
                }
            }
            a.setGrades(q1, q2);
        }
        System.out.println("Name\tSecret Number\tAvg Total Grade\tFR Q1 Grade\tFR Q2 Grade");
        for (Students a: student) {
            System.out.println(a.getStudentName() + "\t" + a.getSecretNumber() + "\t\t\t\t"
                    + a.totalGrade + "\t\t\t\t" + a.q1Grade + "\t\t\t" + a.q2Grade);
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
        if (s.equals("") || s.equals("0"))
            return .01;
        try {
            points -= Integer.parseInt(s) * .25;
            return points;
        }
        catch (Exception e) {}
        String grade[] = s.split(", ");
        for(String l : grade)
        {
            Scanner get = new Scanner(l);
            get.next();
            try
            {
                points += Double.parseDouble(get.next());
            }
            catch(Exception e)
            {

            }
        }

        return points;
    }
    static ArrayList<Students> student = new ArrayList<>();
}

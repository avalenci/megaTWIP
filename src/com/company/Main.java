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
        while (rawData.hasNext()) {
            lines.add(rawData.nextLine());
        }
    }
    static Students findStudent(int numb) {
        for (Students x : student) {
            if (x.getSecretNumber() == numb)
                return x;
        }
        return null;
    }
    static ArrayList<Students> student = new ArrayList<>();
}

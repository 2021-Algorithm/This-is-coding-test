package ch6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LowerGradeStudent {
    public static void tree() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] students = new String[size];
        for(int i = 0 ; i < size ; i++) {
            students[i] = sc.nextLine();
        }

        Arrays.sort(students, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.parseInt(s2.substring(s2.length()-2)) - Integer.parseInt(s1.substring(s1.length()-2));
            }
        });

        for(int i = 0 ; i < students.length ; i++) {
            System.out.println(students[i]);
        }
    }

    public static void main(String[] args) {
        tree();
    }
}

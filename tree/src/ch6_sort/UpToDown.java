package ch6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class UpToDown {
    public static void tree() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        Arrays.sort(arr);

        for(int i = arr.length - 1 ; i >= 0 ; i--) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void tree2() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] sorted = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        for(int i = 0 ; i < sorted.length ; i++) {
            System.out.print(sorted[i] + "\t");
        }
    }

    public static void main(String[] args) {
        tree2();

//        3
//        15
//        27
//        12
    }
}

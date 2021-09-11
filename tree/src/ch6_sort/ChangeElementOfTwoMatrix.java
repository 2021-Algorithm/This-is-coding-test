package ch6_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ChangeElementOfTwoMatrix {
    public static int tree() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int change = sc.nextInt();
        sc.nextLine();
        int[] aArr = new int[length];
        int[] bArr = new int[length];
        for(int i = 0 ; i < length ; i++) {
            aArr[i] = sc.nextInt();
        }
        sc.nextLine();
        for(int i = 0 ; i < length ; i++) {
            bArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        // 4 3 2개
        for(int i = aArr.length - 1 ; i >= aArr.length - change + 1 ; i--) {
            System.out.println("aArr[i] = " + aArr[i]);
            answer += aArr[i];
        }

        for(int i = bArr.length - 1 ; i >= aArr.length - change ; i--) {
            System.out.println("bArr[i] = " + bArr[i]);
            answer += bArr[i];
        }
//
//        //4 3 2 3개
//        for(int i = bArr.length - 1 ; i >= aArr.length - change ; i--) {
//            answer += bArr[i];
//        }

//        aArr = IntStream.of(aArr)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(i -> i)
//                .toArray();
//
//        bArr = IntStream.of(bArr)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(i -> i)
//                .toArray();
//
//        //a
//        for(int i = 0 ; i < aArr.length - change; i++) {
//            answer += aArr[i];
//        }
//        //b
//        for(int i = 0 ; i < change ; i++) {
//            answer += bArr[i];
//        }


        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
//        tree(5, 3, new int[]{1, 2, 5, 4, 3}, new int[]{5, 5, 6, 6, 5});

        tree();
        //26
//        5 3
//        1 2 5 4 3
//        5 5 6 6 5


        //38
//        6 4
//        1 2 5 4 3 5
//        5 5 6 6 5 7
    }
}

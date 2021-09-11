package ch8_DynamicProgramming;

import java.util.Scanner;

public class AntWarrior {
    public static int tree(int n, int[] arr) {
        int answer = 0;

        int[] d = new int[100];
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for(int i = 2; i < n ; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        answer = d[n - 1];
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void dongbin(int n, int[] arr) {
        int[] d = new int[100];
        Scanner sc = new Scanner(System.in);

        // 정수 N을 입력받기
//        int n = sc.nextInt();
//
//        // 모든 식량 정보 입력받기
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        // 계산된 결과 출력
        System.out.println(d[n - 1]);
    }

    public static void main(String[] args) {
        tree(4, new int[]{1, 3, 1, 5});
//        tree(4, new int[]{1, 3, 1, 5});
        tree(4, new int[]{3, 1, 1, 5});
        dongbin(4, new int[]{3, 1, 1, 5});
    }
}

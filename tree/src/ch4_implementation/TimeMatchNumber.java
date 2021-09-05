package ch4_implementation;

import java.util.Scanner;

public class TimeMatchNumber {

    public static int tree(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if(Integer.toString(i).contains("3") || Integer.toString(j).contains("3") || Integer.toString(k).contains("3")) {
                        answer++;
                    }
                    System.out.println(i + ":" + j + ":" + k + ", " + answer);
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
    public static void dong() {

        Scanner sc = new Scanner(System.in);

        // H를 입력받기
        int h = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) {
        tree(5);
    }
}

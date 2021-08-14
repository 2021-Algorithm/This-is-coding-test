package ch3_1_greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LawOfLargeNumber {

    public static int solution(int n, int m, int k, int[] numbers) {
        Arrays.sort(numbers);
        int a = (m / (k + 1)) * k;
        int b = (m / (k + 1));
        int c = m - a - b;
        int answer = numbers[numbers.length -1] * (a + c) + numbers[numbers.length - 2] * b;
        System.out.println("answer = " + answer);
        return answer;
    }

    public static int dongbin(int n, int m, int k, int[] arr) {
        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        solution(5, 8, 3, new int[]{2,4,5,4,6});
        dongbin(5, 8, 3, new int[]{2,4,5,4,6});
        solution(5, 9, 3, new int[]{2,4,5,4,6});
        dongbin(5, 9, 3, new int[]{2,4,5,4,6});

    }



}

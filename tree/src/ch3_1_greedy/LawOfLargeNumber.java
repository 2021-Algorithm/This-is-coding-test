package ch3_1_greedy;

import java.util.Arrays;
import java.util.Collections;

public class LawOfLargeNumber {

    public static int solution(int n, int m, int k, int[] numbers) {
        Arrays.sort(numbers);
        int a = (m / k) * k;
        int b = m % k;
        int answer = numbers[numbers.length -1] * a + numbers[numbers.length - 2] * b;
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(5, 8, 3, new int[]{2,4,5,4,6});
    }
}

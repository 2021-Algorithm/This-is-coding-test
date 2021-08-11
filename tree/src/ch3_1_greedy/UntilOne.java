package ch3_1_greedy;

import java.util.Scanner;

public class UntilOne {
    public static int sol() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        while(n > 1) {
            if(n % k == 0) {
                n = n / k;
                answer++;
            }
            else {
                n = n - 1;
                answer++;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        sol();
    }
}

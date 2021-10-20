package part3.ch14_sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CardMixing {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pq.add(arr[i]);
        }
        Arrays.sort(arr);

        while(pq.size() != 1) {
            int one = pq.poll();
            int two = pq.poll();
            int sum = one + two;
            result += sum;
            pq.add(sum);
        }

        System.out.println(result);
    }

}

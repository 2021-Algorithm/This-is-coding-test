package part3.ch14_sort;

import java.util.*;

public class Antenna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 = 0;
        int temp2 = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        if(arr.length % 2 == 0) {
            for(int i = 0 ; i < n ; i++) {
                temp1 += Math.abs(arr[i] - arr[(n / 2) - 1]);
                temp2 += Math.abs(arr[i] - arr[(n / 2)]);
            }

            if(temp1 >= temp2) {
                System.out.println(arr[(n / 2) - 1]);
            }
            else {
                System.out.println(arr[n / 2]);
            }

        }
        else {
            System.out.println(arr[(n/2)]);
        }
    }
}

package ch7_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class MakeDdunk {

    public static int tree(int n, int m, int[] total) {

        Arrays.sort(total);

        int answer = total[total.length - 1];

        for(int i = answer ; i >= 0 ; i--) {
            int temp = 0 ;
            for(int j = 0 ; j < n ; j++) {
                if(total[j] >= i ){
                    temp += total[j] - i;
                    System.out.println("[in]temp = " + i + "," + temp);
                }

            }
            System.out.println("[out]temp = " + temp);
            if(temp >= m) {
                System.out.println("----------------------");
                System.out.println("[break]temp = " + temp);
                answer = i;
                break;

            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void dong() {
        Scanner sc = new Scanner(System.in);

        // 떡의 개수(N)와 요청한 떡의 길이(M)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 각 떡의 개별 높이 정보
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색을 위한 시작점과 끝점 설정
        int start = 0;
        int end = (int) 1e9; // 10^9
        // 이진 탐색 수행 (반복적)
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // 잘랐을 때의 떡의 양 계산
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid - 1;
            }
            else { // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        tree(4, 6, new int[]{19, 15, 10, 17});
    }
}

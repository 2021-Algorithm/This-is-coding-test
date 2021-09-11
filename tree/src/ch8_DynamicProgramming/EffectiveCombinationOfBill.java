package ch8_DynamicProgramming;

import java.util.*;

public class EffectiveCombinationOfBill {
    public static int tree() {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        sc.nextLine();
//        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            list.add(sc.nextInt());
            sc.nextLine();
        }
        list.sort(Comparator.reverseOrder());

        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void dongbin() {
        Scanner sc = new Scanner(System.in);

        // 정수 N, M을 입력받기
        int n = sc.nextInt();
        int m = sc.nextInt();

        // N개의 화폐 단위 정보를 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
        int[] d = new int[m + 1];
        Arrays.fill(d, 10001);

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        d[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                // (i - k)원을 만드는 방법이 존재하는 경우
                System.out.println("j = " + j);
                if (d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j - arr[i]] + 1);
                }
            }
        }

        for(int i = 0 ; i < d.length ; i++) {
            System.out.println(i + ", d[i] = " + d[i]);
        }

        // 계산된 결과 출력
        if (d[m] == 10001) { // 최종적으로 M원을 만드는 방법이 없는 경우
            System.out.println(-1);
        }
        else {
            System.out.println(d[m]);
        }
    }


    public static void main(String[] args) {
//        tree();
        dongbin();
    }
}

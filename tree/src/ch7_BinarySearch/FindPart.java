package ch7_BinarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindPart {
    public static String tree(int n, Integer[] shop, int m , Integer[] order) {
        String answer = "";

        for(int i = 0 ; i < m ; i++) {
            if(Arrays.asList(shop).contains(order[i])) {
                answer += "yes ";
            }
            else {
                answer += "no ";
            }

        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void dong() {
        Scanner sc = new Scanner(System.in);

        // N(가게의 부품 개수)
        int n = sc.nextInt();
        // 집합(Set) 정보를 처리하기 위한 HashSet 라이브러리
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        // M(손님이 확인 요청한 부품 개수)
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호를 하나씩 확인
        for (int i = 0; i < m; i++) {
            // 해당 부품이 존재하는지 확인
            if (s.contains(targets[i])) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }

    public static void main(String[] args) {
        tree(5, new Integer[]{8, 3, 7, 9, 2}, 3, new Integer[]{5, 7, 9});
    }
}

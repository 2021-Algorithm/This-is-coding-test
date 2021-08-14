package ch3_1_greedy;

import java.util.*;

public class CardGame {

    public static int dong() {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result); // 최종 답안 출력
        return result;
    }

    public static int sol() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map map = new HashMap();
        for(int i = 0 ; i < n ; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < m ; j++) {
                int k = sc.nextInt();
                list.add(k);
                int min = list.stream().mapToInt(v -> v).min().getAsInt();
//                int min = list.stream().sorted().findFirst().get();
                map.put(i, min);
            }
        }
        int compare = 0;
        for (Object key : map.keySet()) {
            compare = (int) map.get(1);
            if(compare < (int)map.get(key)) {
                compare = (int)map.get(key);
            }
        }

        System.out.println("compare = " + compare);
        return compare;
    }

    public static void main(String[] args) {
       sol();
//        dong();
    }
}

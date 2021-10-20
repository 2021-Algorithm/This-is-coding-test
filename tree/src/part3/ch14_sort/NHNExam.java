package part3.ch14_sort;

import java.util.*;

public class NHNExam {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];
    public static int temp;

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 1) {
            // 해당 노드 방문 처리
            graph[x][y] = 0;
            temp++;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = n;

        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

//        for(int i = 0 ; i < n ; i++) {
//            for(int j = 0 ; j < n ; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) {
                    list.add(temp);
                    temp = 0;
                    result += 1;
                }
            }
        }
        Collections.sort(list);
        System.out.println(result); // 정답 출력
//        System.out.println("list = " + list);
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}

package ch5_DFS_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FrozenDrink {

    static int[][] copyFrame;

    public static boolean dfs(int x, int y, int n, int m) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >=n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (copyFrame[x][y] == 0) {
            // 해당 노드 방문 처리
            copyFrame[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y, n, m);
            dfs(x, y - 1, n, m);
            dfs(x + 1, y, n, m);
            dfs(x, y + 1, n, m);
            return true;
        }
        return false;
    }

    public static int tree(int[][] frame) {
        int answer = 0;
        int n = frame.length;
        int m = frame[0].length;


        copyFrame = Arrays.stream(frame)
                .map((int[] row) -> row.clone())
                .toArray((int length) -> new int[length][]);


        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(dfs(i, j, n, m)) {
                    answer++;
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        tree(new int[][]{{0, 0, 1, 1, 0},
                        {0, 0, 0, 1, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0}});

    }
}

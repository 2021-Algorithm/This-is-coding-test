package ch5_DFS_BFS;

import java.util.Arrays;

public class Maze {

    public static int tree(int[][] frame) {
        int answer = 0;
        int n = frame.length;
        int m = frame[0].length;

        int[][] copyFrame = Arrays.stream(frame)
                .map((int[] row) -> row.clone())
                .toArray((int length) -> new int[length][]);

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(copyFrame[i][j] == 1 && i == 0 && j == 0) {
                    answer++;
                    for(int k = 0 ; k < 4 ; k++) {
                        if(copyFrame[i + dx[k]][j + dy[k]] == 1) {
                            answer++;
                        }
                    }
                }
            }
        }



        return answer;
    }

    public static void main(String[] args) {
        tree(new int[][]{
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        });
    }
}

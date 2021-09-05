package ch4_implementation;

import java.util.Scanner;

public class KnightOfKingdom {

    public static int tree(String input) {
        int answer = 0;
        int[] xArr = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] yArr = {2, -2, 2, -2, 1, -1, 1, -1};
        char x = input.charAt(0); //a
        int y = Character.getNumericValue(input.charAt(1)); //1
        for(int i = 0; i < 8 ; i++) {
            char moveX = (char)(x + xArr[i]);
            int moveY = y + yArr[i];
            if(moveX >= 'a' && moveY <= 'h' && moveY >= 1 && moveY <= 8) {
                answer++;

            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void dong() {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        char a = 'a';
        System.out.println((char)(a+1));
        tree("a1");
    }
}

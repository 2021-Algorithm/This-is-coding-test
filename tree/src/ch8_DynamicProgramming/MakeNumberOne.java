package ch8_DynamicProgramming;

public class MakeNumberOne {

    public static int tree(int input) {
        int answer = 0;
        while(input > 1) {
            if(input % 5 == 0) {
                input = input / 5;
                answer++;
            }
            else if(input % 3 == 0) {
                input = input / 3;
                answer++;
            }
            else {
                input = input - 1;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(tree(26));
    }
}

package part3.ch11_greedy;

public class AdventureGuild {
    public static int solution(int n, int[] members) {
        int answer = 0;
        int sum = 0;
        for(int i = 0 ; i < members.length ; i++) {
            sum += members[i];
            if(sum >= n) {
                answer++;
                sum = 0;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution(5, new int[]{2,3,1,2,2});
    }
}

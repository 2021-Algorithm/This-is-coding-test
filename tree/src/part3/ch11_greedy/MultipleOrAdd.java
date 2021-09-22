package part3.ch11_greedy;

public class MultipleOrAdd {
    public static int solution(String s) {
        int answer = 1;
        for(int i = 0 ; i < s.length() ; i++) {
            char split = s.charAt(i);
            int temp = Character.getNumericValue(split);
            if(temp == 0) {
                answer += temp;
            }
            else {
                answer *= temp;
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("02984");
        solution("567");
    }
}

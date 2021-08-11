package ch3_1_greedy;

public class Changes {

    /**
     * 예제 3-1 거스름돈
     * 당신은 음식점의 계산을 도와주는 직원이다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이
     * 무한히 존재한다고 가정한다.손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러줘야할 동전의 최소 개수를 구하라.
     * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
     * @param change : 거스름돈 금액
     * @return 동전의 개수
     * > 가장 큰 화폐 단위부터 돈을 거슬러 주는 것이 해결 방법
     */
    public static int solution(int change) {
        int answer = 0;
        int[] coins = {500, 100, 50, 10};
        for(int i = 0 ; i < coins.length ; i++) {
            answer += change / coins[i];
            change %= coins[i];
        }
        System.out.println("answer = " + answer);
        return answer;
    }
    /*
        시간 복잡도는 O(K)이고, 시간 복잡도에서 거슬러 줘야하는 돈 N은 존재하지 않고
        동전의 총 종류에만 영향을 받는다.
     */

    public static void main(String[] args) {
        solution(1260);

    }
}

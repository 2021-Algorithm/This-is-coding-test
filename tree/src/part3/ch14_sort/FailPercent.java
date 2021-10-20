package part3.ch14_sort;

import java.util.*;
import java.util.stream.Collectors;

class FailPercent {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        Map<Integer, Double> map = new HashMap<>();
        Map<Integer, Double> resultMap = new HashMap<>();

        double sum = stages.length;

        for(int i = 0 ; i < stages.length ; i++) {
            if(map.containsKey(stages[i])) {
                map.put(stages[i], map.get(stages[i]) + 1);
            }
            else {
                map.put(stages[i], 1.0);
            }
        }

        for(int i = 1 ; i <= N ; i++) {
            if(map.containsKey(i)) {
                double value = map.get(i);
                double result = value / sum;
                sum -= value;
                resultMap.put(i, result);
            }
            else {
                resultMap.put(i, 0.0);
            }
        }


        Map<Integer, Double> sortedMap = resultMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        int[] answer = sortedMap.keySet().stream().mapToInt(Integer::intValue).toArray();
        for(int i = 0 ; i < answer.length ; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
        return answer;
    }

    public static void main(String[] args) {
        FailPercent f = new FailPercent();
        f.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
        f.solution(4, new int[]{4,4,4,4,4});

    }

}

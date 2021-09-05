package ch5_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5); //queue.offer(5);
        queue.add(2);
        queue.add(3);
        queue.add(7);
        queue.poll(); //queue.remove();
        queue.add(1);
        queue.add(4);
        queue.poll();

        //dong의 print문, 원소를 제거하는 방식이라서 사용하지 않음
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        for(Integer s : queue) {
            System.out.println(s);
        }
    }
}

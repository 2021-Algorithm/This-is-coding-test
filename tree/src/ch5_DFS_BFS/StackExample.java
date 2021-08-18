package ch5_DFS_BFS;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(5); //stack.push(5);
        stack.add(2);
        stack.add(3);
        stack.add(7);
        stack.pop();
        stack.add(1);
        stack.add(4);
        stack.pop();

        for(int i = 0 ; i < stack.size() ; i++) {
            System.out.println(stack.elementAt(i));
        }

//        while (!stack.empty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
    }
}

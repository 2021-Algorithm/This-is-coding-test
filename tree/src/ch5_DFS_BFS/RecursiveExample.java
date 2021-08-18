package ch5_DFS_BFS;

public class RecursiveExample {
    public static void main(String[] args) {
        recursiveFunction();
    }

    //StackOverflowError
    public static void recursiveFunction() {
        System.out.println("재귀 함수를 호출합니다.");
        recursiveFunction();
    }
}

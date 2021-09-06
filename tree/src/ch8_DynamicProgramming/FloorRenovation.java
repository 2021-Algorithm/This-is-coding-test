package ch8_DynamicProgramming;

public class FloorRenovation {
    public static int tree(int n) {
        int answer = 0;
        int multi = 0;
        int single = 0;
        multi = n / 2;
        single = n - (multi * 2);

        //1개짜리와 2개짜리의 순서를 구성, 2개짜리는 무조건 최대치로 넣어서
        int total = fact(multi + single) / (fact(multi) * fact(single));
//        int divisor = fact(multi) * fact(single);
//                / (fact(multi) * fact(single));

        System.out.println("total = " + total);
//        System.out.println("divisor = " + divisor);

        answer = (int)(total * Math.pow(3, multi)) - total + 1;
        System.out.println("answer = " + answer);

        return answer;
    }

    public static int fact(int n) {
        if (n == 1) {
            return n;
        }
        else if (n == 0) {
            return 1;
        }

        else {
            return fact(n-1) * n;
        }
    }


    public static void main(String[] args) {
        tree(3);
        System.out.println("========");
        tree(5);
        System.out.println("========");
        tree(6);
    }
}

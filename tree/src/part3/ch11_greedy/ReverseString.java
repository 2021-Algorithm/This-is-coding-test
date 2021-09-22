package part3.ch11_greedy;

import java.util.Scanner;

public class ReverseString {
    public static int solution(String s) {
        int answer = 0;
        char temp = s.charAt(0);
        String shorten = Character.toString(temp);
        for(int i = 1 ; i < s.length() ; i++) {
            if(temp != s.charAt(i)) {
                shorten += Character.toString(s.charAt(i));
                temp = s.charAt(i);
            }
        }

        System.out.println(shorten);
        System.out.println(shorten.length() / 2);
        return shorten.length() / 2;
    }

    public static void main(String[] args) {
        solution("0001100111000010");
    }
    //백준 채점코드

//    import java.util.*;
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String s = sc.next();
//            char temp = s.charAt(0);
//            String shorten = Character.toString(temp);
//            for(int i = 1 ; i < s.length() ; i++) {
//                if(temp != s.charAt(i)) {
//                    shorten += Character.toString(s.charAt(i));
//                    temp = s.charAt(i);
//                }
//            }
//            System.out.println(shorten.length() / 2);
//        }
//    }
}

package part3.ch14_sort;

import java.util.*;

public class KoreanEnglishMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();
            list.add(new Student(name, korean, english, math));
        }


        //국어점수가 감소하는 순서로
        //영어점수가 증가하는 순서로
        //수학점수가 감소하는 순서로
        //이름이 사전순으로 증가하는 순서로
        Collections.sort(list,
//                Comparator.comparing(Student::getName)
                Comparator.comparing(Student::getNo)
                        .thenComparing((a, b) -> b.korean - a.korean)
                        .thenComparing((a,b) -> a.english - b.english)
                        .thenComparing((a,b) -> b.math - a.math)
                        .thenComparing(Student::getName)
        );


        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i).getName());
        }

//        myList.sort(Comparator.comparing(MyObject::getAttributeX)
//                .thenComparing(i -> i.getSomething().getSubValue())
//                .thenComparing((a, b) -> a.getInt() - b.getInt()));

        /*
        Collections.sort(myList, new Comparator<MyObject>() {
            @Override
            public int compare(MyObject a, MyObject b) {
                int cmp0 = a.getAttributeX().compareTo(b.getAttributeX());
                if (cmp0 != 0) {
                    return cmp0;
                }
                int cmp1 = a.getSomething().getSubValue().compareTo(b.getSomething().getSubValue());
                if (cmp1 != 0) {
                    return cmp1;
                }
                return a.getInt() - b.getInt();
            }
        });
         */
    }

    static class Student {
        String name;
        int korean;
        int english;
        int math;
        String no;

        public Student() {

        }

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
            this.no = "";
        }

        public String getName() {
            return name;
        }

        public int getKorean() {
            return korean;
        }

        public int getEnglish() {
            return english;
        }

        public int getMath() {
            return math;
        }

        public String getNo() {
            return no;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", korean=" + korean +
                    ", english=" + english +
                    ", math=" + math +
                    ", no='" + no + '\'' +
                    '}';
        }
    }
}

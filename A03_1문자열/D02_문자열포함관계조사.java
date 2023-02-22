package A03_1문자열;

/* 문제
문자열 A와 B가 주어질 때, 문자열 B가 문자열 A에 포함되어 있는지를 조사하는 프로그램을 작성하시오.
단, 문자열 A와 B에는 알파벳으로만 이루어져 있으며, 공백은 포함되지 않는다고 가정한다.
 */

/* 입력
첫 번째 줄에 문자열 A, 두 번째줄에 문자열 B가 주어진다.
각각의 길이는 1,000을 넘지 않는다. 두 문자열은 모두 소문자 알파벳으로만 구성되어있다.
 */

/* 출력
문자열 B가 문자열 A에 포함되면 YES, 아니면 NO를 출력한다.
 */

/*
예제 입력
watermelon
melon

예제 출력
YES
 */

import java.util.Scanner;

public class D02_문자열포함관계조사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().contains(sc.nextLine()) ? "YES" : "NO");
    }
}

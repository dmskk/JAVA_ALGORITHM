package A03_1문자열;

/* 문제
문자열이 주어질 때, 대문자는 소문자로, 소문자는 대문자로 바꾸는 프로그램을 작성하시오.
알파벳이 아닌 문자는 그대로 유지한다.
 */

/* 입력
첫 번째 줄에 문자열이 주어진다. ( 1 ≤ 문자열의 길이 ≤ 1,000 )
 */

/* 출력
문자열 내의 대문자는 소문자로, 소문자는 대문자로 바꾼 결과를 출력한다.
 */

/*
예제 입력
hELLO wORLD!

예제 출력
Hello World!
 */

import java.util.Scanner;

public class A01_대소문자변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int d = 'A' - 'a';

        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') System.out.print((char)(c+d));
            else if(c >= 'A' && c<='Z') System.out.print((char)(c-d));
            else System.out.print((char)c);
        }
    }
}

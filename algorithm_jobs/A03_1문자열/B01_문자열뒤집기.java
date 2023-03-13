package algorithm_jobs.A03_1문자열;

/* 문제
문자열이 주어질 때, 이를 뒤집어서 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫 번째 줄에 문자열이 주어진다. ( 1 ≤ 문자열의 길이 ≤ 1,000 )
 */

/* 출력
문자열을 뒤집은 결과를 출력한다.
 */

/*
예제 입력
Hello World!

예제 출력
!dlroW olleH
 */

import java.util.Scanner;

public class B01_문자열뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}

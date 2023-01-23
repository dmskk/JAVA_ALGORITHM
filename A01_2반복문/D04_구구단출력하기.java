package A01_2반복문;

/* 문제
1 - 9 사이의 자연수를 입력받고, 그에 맞는 구구단을 출력하는 프로그램을 작성해보자.
 */

/* 입력
첫째 줄에 자연수N이 입력된다. ( 1 <= N <= 9 )
 */

/* 출력
N에 해당하는 구구단을 출력한다. (단, 숫자와 문자 사이에 공백은 없다.)
 */

/*
예제 입력
5
예제 출력
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
 */

import java.util.Scanner;

public class D04_구구단출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}

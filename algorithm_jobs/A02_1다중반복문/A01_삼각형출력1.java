package algorithm_jobs.A02_1다중반복문;

/* 문제
n층의 삼각형을 출력하는 프로그램을 작성하여라. Input, Output의 예제를 참고한다.
 */

/* 입력
첫째 줄에 정수n이 주어진다. (0≤n≤100)
 */

/* 출력
다음 예제와 같이 삼각형 모양으로 ‘*’을 출력한다.
 */

/*
예제 입력
3
예제 출력
*
**
***
 */

/*
예제 입력
6
예제 출력
*
**
***
****
*****
******
 */

import java.util.Scanner;

public class A01_삼각형출력1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

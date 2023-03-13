package algorithm_jobs.A01_2반복문;

/*
문제
N부터 M까지 출력하는 프로그램을 작성해보자.
 */

/*
입력
첫째 줄에 자연수 N과 자연수 M이 공백을 가지고 주어진다. (N ≤ M ≤ 1000)
 */

/*
출력
첫째 줄에 N부터 M까지의 자연수를 공백을 사이에 두고 차례대로 출력한다.
 */

/*
예제 입력
1 7
예제 출력
1 2 3 4 5 6 7
 */

/*
예제 입력
500 512
예제 출력
500 501 502 503 504 505 506 507 508 509 510 511 512
 */

import java.util.Scanner;

public class A01_NtoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=n; i<=m; i++) {
            System.out.print(i + " ");
        }
    }
}

package algorithm_jobs.A01_2반복문;

/* 문제
1부터 N까지의 숫자 중 짝수의 합을 구하는 프로그램을 작성하여라.
 */

/* 입력
첫째 줄에 N이 주어진다. (1 <= N <= 2000)
 */

/* 출력
1부터 N까지의 숫자 중 짝수의 합을 출력한다.
 */

/*
예제 입력
2
예제 출력
2
 */

/*
예제 입력
10
예제 출력
30
 */

import java.util.Scanner;

public class D01_짝수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i=2; i <= n; i+=2) sum += i;

        System.out.println(sum);
    }
}

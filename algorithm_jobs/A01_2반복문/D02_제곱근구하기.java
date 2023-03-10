package algorithm_jobs.A01_2반복문;

/* 문제
N이 주어질 때, 제곱하여 N보다 크거나 같은 숫자들 중 최솟값을 출력하는 프로그램을 작성하시오.

예를 들어, N = 10 이라고 하자. 그러면 s=3 일 경우 3 x 3 = 9 이므로 10보다 크거나 같지 않다.
s=4일 경우, 4 x 4 = 16 이므로 10보다 크거나 같다. s=5일 경우, 5 x 5 = 25 이므로 10보다 크거나 같다.
즉, s = 4, 5, 6, ..., 의 숫자들은 모두 제곱하면 10보다 크거나 같다. 이 중 최솟값은 4이므로, 4를 출력한다.
 */

/* 입력
첫 번째 줄에 N이 주어진다. (1 <= N <= 10000)
 */

/* 출력
제곱하여 N보다 크거나 같은 숫자들 중 최솟값을 출력한다.
 */

/*
예제 입력
10
예제 출력
4
 */

/*
예제 입력
100
예제 출력
10
 */

import java.util.Scanner;

public class D02_제곱근구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i <= n; i++) {
            if(i*i >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}

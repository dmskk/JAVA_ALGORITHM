package A01_2반복문;

/* 문제
N이 주어질 때, N부터 1까지 카운트다운을 하는 프로그램을 작성하시오. 즉, N부터 1까지 숫자를 모두 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫 번째 줄에 숫자 N이 주어진다. (1 <= N <= 100)
 */

/* 출력
숫자 N부터 1까지를 한 줄에 하나씩 출력한다.
 */

import java.util.Scanner;

public class C01_Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=n; i>=1; i--) {
            System.out.println(i);
        }
    }
}

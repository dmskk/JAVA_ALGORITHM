package algorithm_jobs.A01_2반복문;

/*
문제
1부터 N까지의 숫자를 출력한다. 단, 3의 배수에서는 문자 X를 출력한다.
 */

/*
입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 1000)
 */

/*
출력
1부터 N까지의 숫자를 출력하되, 3의 배수에서는 문자 X를 출력한다.
 */

/*
예제 입력
10
예제 출력
1 2 X 4 5 X 7 8 X 10
 */

import java.util.Scanner;

public class B01_3의배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if(i%3==0) System.out.print("X ");
            else System.out.print(i + " ");
        }
    }
}

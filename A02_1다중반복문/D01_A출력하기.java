package A02_1다중반복문;

/* 문제
n층의 A를 출력하는 프로그램을 작성하여라. Input, Output의 예제를 참고한다. (단, n은 항상 홀수만 주어진다.)
 */

/* 입력
첫째 줄에 자연수이며, 홀수인 n이 주어진다. (5≤n≤100)
 */

/* 출력
다음 예제와 같이 A 모양으로 ‘*’을 출력한다.
 */

/*
예제 입력
5
예제 출력
    *
   * *
  *****
 *     *
*       *
 */

/*
예제 입력
7
예제 출력
      *
     * *
    *   *
   *******
  *       *
 *         *
*           *
 */

import java.util.Scanner;

public class D01_A출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            if(i == n/2) {
                for(int j=0; j<n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for(int j=0; j<2*i-1; j++) {
                    System.out.print(" ");
                }
                if(i>0) System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}

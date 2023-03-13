package algorithm_jobs.A02_1다중반복문;

/* 문제
유니는 N * N 개의 동전을 정사각형 형태로 모두 뒷면으로 보관하고 있다.

어느날 지니가 유니의 동전을 보고 이렇게 모두 뒷면이면 너무 단조로워 보인다면서
왼쪽 위에서 오른쪽 아래로 내려가는 대각선에 있는 동전을 앞면으로 뒤집어버렸다.

지니가 뒤집은 후 동전의 상태를 출력하는 프로그램을 작성하시오.
뒷면인 동전은 0, 앞면인 동전은 1로 출력한다.
 */

/* 입력
첫째 줄에 N이 주어진다.
( 1 ≤ N ≤ 1,000 )
 */

/* 출력
N줄에 걸쳐 동전의 상태를 출력한다.
 */

/*
예제 입력
5
예제 출력
10000
01000
00100
00010
00001
 */

import java.util.Scanner;

public class C01_대각선 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) System.out.print("1");
                else System.out.print("0");
            }
            System.out.print("\n");
        }
    }
}

package algorithm_jobs.A02_2배열;

/* 문제
N이 주어질 때, 다음과 같은 프로그램을 작성해보자.
 */

/* 입력
첫째 줄에 자연수 N이 주어진다.(1<=N<=100)
 */

/* 출력
예시를 참고하여 작성하자.
 */

/*
예제 입력
3
예제 출력
1 2 4
3 5
6
 */

/*
예제 입력
5
예제 출력
1 2 4 7 11
3 5 8 12
6 9 13
10 14
15
 */

import java.util.Scanner;

public class A04_array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[110][110];
        int x, y;
        int num = 1;
        for(int i=1; i<=n; i++) {
            x = 1;
            y = i;
            while(y > 0) {
                arr[x++][y--] = num++;
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

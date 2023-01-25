package A02_2배열;

/* 문제
정수를 입력으로 받아 입력 받은 수를 거꾸로 출력하는 문제이다.
 */

/* 입력
입력의 첫 수는 수의 개수 n 이다. ( 1 <= n <= 1000 ) 다음 줄에는 n 개의 수가 입력으로 주어진다. 각 수는 -10000 초과 10000 미만인 정수이다.
 */

/* 출력
한 줄에 입력받은 수를 거꾸로 출력한다.
 */

/*
예제 입력
5
1 2 3 4 5
예제 출력
5 4 3 2 1
 */

/*
예제 입력
8
1 -2 3 4 6 8 2 1
예제 출력
1 2 8 6 4 3 -2 1
 */

import java.util.Scanner;

public class A01_역으로출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1010];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

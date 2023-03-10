package algorithm_jobs.A01_2반복문;

/* 문제
지니 동네에는 아나바다 운동이 한창이다.
운영자는 효율적인 처리를 위해 가져온 소지품이 가장 적은 사람부터 줄을 세워 소지품을 내려놓게 했다.
소지품을 가져온 사람은 총 100명으로 놀랍게도 각 사람은 소지품을 1, 2, 3, 4, ... 100개 들고 왔다.
또한 소지품을 x개 가져온 사람은 자신의 소지품 한 개당 가치를 x라고 생각한다.
즉, 나열된 소지품의 가치는 앞에서부터 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5, ... 100이 된다.
소지품들을 구경하던 지니는 S번째 소지품부터 E번째 소지품까지의 가치의 합이 궁금해졌다.
지니의 궁금증을 해결할 수 있도록 가치의 합을 구해주는 프로그램을 작성하시오.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다.
각 테스트케이스의 첫 줄에 S, E가 공백으로 구분되어 주어진다.
( 1 ≤ T ≤ 10, 1 ≤ S ≤ E ≤ 1,000 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 S번째 물건부터 E번째 물건까지의 가치의 합을 출력한다.
 */

import java.util.Scanner;

/*
예제 입력
5
3 24
24 27
3 12
12 17
7 17
예제 출력
#1 109
#2 28
#3 37
#4 32
#5 53
 */
public class D05_아나바다운동 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100000];
        int idx=1;
        for(int i=1; i<=100; i++) {
            for(int j=0; j<i; j++) {
                arr[idx++] = i;
            }
        }

        int T = sc.nextInt();

        for(int t=1; t<=T; t++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int sum = 0;

            for(int i=s; i<=e; i++) {
                sum += arr[i];
            }

            System.out.println("#" + t + " " + sum);
        }
    }
}

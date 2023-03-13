package algorithm_jobs.A02_2배열;

/* 문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최대값을 찾고 그 최대값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61 이 주어지면, 이들 중 최대값은 85이고, 이 값은 8번째 수이다.
 */

/* 입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 */

/* 출력
첫째 줄에 최대값을 출력하고, 둘째 줄에 최대값이 몇 번째 수인지를 출력한다.
 */

/*
예제 입력
3
29
38
12
57
74
40
85
61
예제 출력
85
8
 */

import java.util.Scanner;

public class B01_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mx = -1;
        int idx = 0;

        for(int i=1; i<=9; i++) {
            int num = sc.nextInt();
            if(num > mx) {
                mx = num;
                idx = i;
            }
        }

        System.out.println(mx);
        System.out.println(idx);
    }
}

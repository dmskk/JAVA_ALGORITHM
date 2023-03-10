package algorithm_jobs.A01_1조건문;
/*
문제
두 수 A,B를 입력받고, A - B를 출력하는 프로그램을 작성해보자.
단, A - B가 0보다 작은 경우는 결과값이 아닌 -1을 출력해야한다.
 */

/*
입력
첫째 줄에 정수 A,B가 주어진다. ( A,B는 100 이하의 정수 )
 */

/*
출력
첫째 줄에 A - B를 출력한다. (단, A - B가 0보다 작은 경우는 -1을 출력한다.)
 */

/*
예제 입력
10 5
예제 출력
5
 */

/*
예제 입력
45 55
예제 출력
-1
 */


import java.util.Scanner;

public class A01_a_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        int result = a - b;
        if(result < 0) result = -1;

        System.out.println(result);
    }

}

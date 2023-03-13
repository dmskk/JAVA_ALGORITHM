package algorithm_jobs.A04_1완전탐색;

/* 문제
고등학생인 유니는 수학 시험을 대비해 공부를 하는 중이다.
학원에서 내준 숙제를 풀어야 하는데 놀다가 결국 숙제를 미루게 되었다.
학원에 가기 전에 잠깐 문제를 풀려고 하는데, 간단한 이차방정식의 근을 구하는 문제이다.
유니를 도와 이차방정식의 근을 구하는 프로그램을 작성하시오.
 */

/* 입력
x^2 + 2ax + b = 0의 계수 a,b가 주어진다. a,b는 정수이며, 이 이차방정식의 근은 항상 정수임이 보장된다.
단, x는 -1000보다 크거나 같고 1000보다 작거나 같은 수임이 보장된다.
(-1000≤a,b≤1000)
 */

/* 출력
첫 번째 줄에 이차방정식의 근들을 모두 공백으로 분리해 오름차순으로 출력한다. 근이 한 개일 경우 하나만 출력한다.
 */

/*
예제 입력
3 8

예제 출력
-4 -2
 */

/*
예제 입력
-1 1

예제 출력
1
 */


import java.util.Scanner;

public class A01_유니의숙제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int x=-1000; x<=1000; x++) {
            if(x*x + 2*a*x + b == 0) System.out.print(x + " ");
        }
    }
}

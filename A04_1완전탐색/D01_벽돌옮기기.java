package A04_1완전탐색;

/* 문제
유니네 팀과 지니네 팀은 지금 알랩빌딩의 공사현장에 있다.
유니네 팀원은 하루에 인당 x개의 벽돌을 옮기고, 지니네 팀원은 하루에 인당 y개의 벽돌을 옮긴다는 것이 알려져있다.
작업반장 알랩이는 유니네 팀원과 지니네 팀원이 각각 몇명인지 구하고 싶으나, 일일히 분류해서 세는 것을 귀찮아한다.
그래서 알랩이는 묘수를 떠올렸는 데, 전체 작업 인원 N을 세고, 옮긴 총 벽돌의 수 M을 구해서 각각 몇 명이 있는지를 구하는 것이다.
이제 우리가 힘을 쓸 차례이다. x,y,N,M이 주어졌을 때, 유니네 팀원과 지니네 팀원이 각각 몇명인지 구하는 프로그램을 만들어보자.
 */

/* 입력
첫째 줄에 x,y,N,M이 공백을 두고 순서대로 주어진다. (1<=x,y<=1,000, 2<=N<=1,000, 2<=M<=1,000,000)
 */

/* 출력
유니네 팀원의 수와, 지니네 팀원의 수를 공백을 두고 순서대로 출력한다.
가능한 경우가 두 개 이상이거나, 불가능하다면 -1을 출력한다.
아울러, 유니와 지니의 팀 모두 최소 한 명이 있음이 보장된다.
 */

/*
예제 입력
3 5 8 32

예제 출력
4 4
 */

/*
예제 입력
3 5 8 41

예제 출력
-1
 */

import java.util.Scanner;

public class D01_벽돌옮기기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int flag = 0;
        int ans = 0;

        for(int n = 1; n < N; n++) {
            if((n * x) + ((N-n) * y) == M) {
                flag++;
                ans = n;
                if(flag > 1) {
                    break;
                }
            }
        }

        if(flag == 1) {
            System.out.printf("%d %d", ans, N - ans);
        } else {
            System.out.println(-1);
        }
    }
}

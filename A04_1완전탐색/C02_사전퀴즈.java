package A04_1완전탐색;

/* 문제
유니는 서로 다른 알파벳 두 개로 구성된 문자열을 모두 갖고 있다.
즉, ab ac ad ae, … zy를 모두 갖고 있다.

유니는 이 문자열들을 사전 순서대로 나열했다.
이제 유니가 자신의 사전에 있는 문자열 하나를 말하면 지니가 그 문자열이 사전의 몇 번째 문자열인지 대답하는 퀴즈를 진행한다.

이 퀴즈의 정답을 출력하는 프로그램을 만들어서 지니를 도와주자.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다..
각 테스트케이스의 첫 줄에 서로 다른 알파벳 소문자 두개로 구성된 문자열이 주어진다.
( 1 ≤ T ≤ 10 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 퀴즈의 정답을 출력한다.
 */

/*
예제 입력
5
ar
uy
in
js
zm

예제 출력
#1 17
#2 524
#3 213
#4 243
#5 638
 */


import java.util.Scanner;

public class C02_사전퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int t=1; t<=T; t++) {
            String str = sc.nextLine();
            int n = (str.charAt(0) - 'a') * 25 + (str.charAt(1) - 'a');
            if(str.charAt(0) > str.charAt(1)) n++;

            System.out.println("#" + t + " " + n);
        }
    }
}

package algorithm_jobs.A01_1조건문;

/*
문제
"코카콜라 맛있다. 맛있으면 또먹지. 딩동댕동..."

모두들 이를 기억할 것이다. 코카콜라. 무언가를 골라야할 때 이 노래를 부르면서 정하고는 했었다.

각 음절마다 손가락을 하나씩 바꿔가면서 노래가 끝날 때 가르키는 선택지를 최종 선택하는 방식이었다.

이번에는 선택지가 5개라고 해보자. 그래서 손가락 5개를 가지고 코카콜라를 할 것이다. 이를 그림으로 표현하면 아래와 같다.


https://storage.googleapis.com/instapage-user-media/f2161225/63178165-0--.jpg

위의 그림과 같은 방향으로 돌아가면서 선택지 사이를 움직이는 것이다.

유니는 이런 지겨운 방식을 단숨에 계산해주는 프로그램을 만들고자 한다.

노래의 길이 n이 입력으로 들어올 때 몇번째 손가락이 선택되는지 출력하는 프로그램을 작성하시오.
 */

/*
입력
첫째 줄에 노래의 길이 N이 주어진다.(1<=N<=10^9 )
 */

/*
출력
N 길이의 노래에 대해서 마지막으로 고르게 되는 손가락의 번호를 출력하시오.

손가락은 엄지부터 새끼손까락까지 순서대로 1,2,3,4,5로 번호가 매겨져있다.
 */

/*
예제 입력
9
예제 출력
1
 */

/*
예제 입력
10005
예제 출력
5
 */


import java.util.Scanner;

public class B02_코카콜라 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result;

        if(n % 8 == 0) result = 2;
        else if(n % 8 == 7) result = 3;
        else if(n % 8 == 6)  result = 4;
        else result = n % 8;

        System.out.println(result);
    }
}

package A02_1다중반복문;

/* 문제
제곱수를 안다는 것은 매우 중요하다.
유니는 a부터 b 사이에 있는 완전제곱수가 전부 구하고 싶다.
유니를 위해 a 이상 b 이하의 완전제곱수들 중 최솟값과 최댓값을 찾고, 모든 완전제곱수의 합을 구해주자.
예를 들어 a=3, b=17이라면 그 사이의 완전제곱수는 4,9,16으로 모든 완전제곱수의 합은 29이며, 최솟값은 4, 최댓값은 17이다.
 */

/* 입력
첫째 줄에 a와 b가 주어진다.(1<=a<b<=10000)
 */

/* 출력
첫째줄에 a와 b 사이의 완전제곱수의 합을 전부 더한 값을 출력한다. 두번째 줄에는 완전제곱수들 중 최솟값과 최댓값을 순서대로 출력한다.
만약 완전제곱수가 하나도 없다면 첫째줄에 -1을 출력하고 프로그램을 종료한다.
 */

/*
예제 입력
3 17
예제 출력
29
4 16
 */

/*
예제 입력
1 100
예제 출력
385
1 100
 */

import java.util.Scanner;

public class D03_제곱수탐색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mx = -1;
        int mn = 100010;
        int sum = 0;
        for(int i=a; i<=b; i++) {
            int sqrt = (int) Math.sqrt(i);
            if(sqrt * sqrt == i) {
                sum += i;
                if(mx < i) mx = i;
                if(mn > i) mn = i;
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(mn + " " + mx);
        }

    }
}

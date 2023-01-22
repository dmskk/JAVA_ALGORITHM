package conditional_statements;

/*
문제
와~! 겨울이다!!
지니는 소복히 쌓인 눈을 모아서 눈사람을 만들려한다.
눈사람의 얼굴과 몸통을 만들기 위해 두개의 눈덩이를 열심히 굴리고 있다.
그때, 지나가던 유니가 지니에게 자신의 눈사람을 먼저 만들어달라 부탁하였다.
누군가의 부탁을 잘 들어주는 지니이지만, 자기 자신이 모은 눈으로 두 개의 눈사람을 만들 수가 없는 상황이라면 유니의 부탁을 거절하려고 한다.
과연 지니가 눈사람 두 개를 만들 수 있는지 확인하는 프로그램을 작성하자.
 */

/*
입력
첫째 줄에 지니가 모은 두 개의 눈덩이의 크기 a, b가 주어진다. (0 <= a, b <= 10^9)
둘째 줄에 눈사람 하나를 만드는데 필요한 눈들의 크기 c가 주어진다.(0 <= c <= 10^9 + 1)
 */

/*
출력
만약 지니가 모은 눈들로 눈사람 두 개를 만들 수 있으면 만들고 나서 남은 눈의 크기를, 아니면 처음에 가지고 있던 눈의 크기를 출력한다.
 */

/*
예제 입력
8769 3151
20000
예제 출력
11920
 */

/*
예제 입력
15000 10000
8000
예제 출력
9000
 */

import java.util.Scanner;

public class snow_man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b >= 2*c) System.out.println((a + b) - 2*c);
        else System.out.println(a+b);
    }
}

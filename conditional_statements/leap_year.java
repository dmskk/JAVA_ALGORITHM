package conditional_statements;

/*
문제
연도가 주어졌을 때, 그 연도가 윤년인지 아닌지를 판단하는 프로그램을 작성해보자.
    1. 윤년은 4의 배수이며 100의 배수는 아닌 연도
    2. 400의 배수인 연도
 */

/*
입력
첫째 줄에 연도 N이 주어진다. N은 5000이하의 자연수이다.
 */

/*
출력
첫째 줄에 연도를 나타내는 N이 윤년이면 YES, 윤년이 아니면 NO를 출력한다.
 */

/*
예제 입력
2000
예제 출력
YES
 */

/*
예제 입력
1900
예제 출력
NO
 */

/*
예제 입력
1992
예제 출력
YES
 */

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}

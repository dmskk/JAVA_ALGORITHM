package conditional_statements;

/*
3 개의 정수가 주어질 때, 이 중 최댓값을 찾는 프로그램을 작성하여라.
 */

/*
입력
첫째 줄에 3개의 정수a,b,c 가 주어진다. (0≤a,b,c≤10,000)
 */

/*
출력
첫째 줄에 a,b,c 중 최댓값을 출력한다.
 */

/*
예제 입력
10 2 5
예제 출력
10
 */

/*
예제 입력
3 7 7
예제 출력
7
 */

import java.util.Scanner;

public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mx = -1;
        for(int i=0; i<3; i++) {
            int num = sc.nextInt();
            if(num > mx) mx = num;
        }

        System.out.println(mx);
    }
}

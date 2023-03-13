package algorithm_jobs.A01_2반복문;

/* 문제
자연수n이 주어질 때, n 이 소수인지 판별하는 프로그램을 작성하여라.
여기서 소수란, 약수가 1과 자기자신밖에 존재하지 않는 수를 말한다.
 */

/* 입력
첫째 줄에 자연수 n이 주어진다. (2≤n≤20,000)
 */

/* 출력
첫째 줄에 n이 소수이면 YES, 소수가 아니면 NO를 출력한다.
 */

/*
예제 입력
2
예제 출력
YES
 */

/*
예제 입력
13
예제 출력
YES
 */

/*
예제 입력
15847
예제 출력
NO
 */



import java.util.Scanner;

public class C02_소수판별1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        for(int i=2; i*i<=n; i++) {
            if(n % i == 0) cnt++;
        }

        if(cnt == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}

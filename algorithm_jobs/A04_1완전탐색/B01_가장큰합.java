package algorithm_jobs.A04_1완전탐색;

/* 문제
유니는 길이가 N인 수열을 만들었다.
유니는 문득 이 수열에서 서로 다른 위치에 있는 두 수의 합이 M 이하가 되도록 고르면서, 그 합이 가장 크게 되는 경우의 그 합이 궁금해졌다.
그런데 유니가 계산하기에 수열의 길이가 너무 길다. 유니 대신 위 내용을 계산해주는 프로그램을 작성해보자.
만약 합이 M 이하가 되도록 고를 수 없다면 -1을 출력한다.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다..
각 테스트케이스의 첫 줄에 N, M이 공백으로 구분되어 주어진다.
각 테스트케이스의 두번째 줄에 유니가 만든 수열이 공백으로 구분되어 주어진다. 수열에 포함되는 수는 모두 1 이상 1,000,000 이하의 자연수다.
( 1 ≤ T ≤ 10, 1 ≤ N ≤ 1,000, 1 ≤ M ≤ 2,000,000 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 테스트케이스의 정답을 출력한다.
 */

/*
예제 입력
10
6 16
15 10 8 15 31 14
9 11
1 42 7 32 49 43 23 26 26
10 9
39 34 16 16 3 22 3 12 2 47
5 16
40 21 26 47 23
6 32
3 6 3 2 33 28
9 15
9 40 2 12 35 22 8 30 11
5 2
37 13 7 40 40
5 43
23 43 49 30 34
7 8
36 1 14 3 17 34 6
6 33
30 5 43 23 19 37

예제 출력
#1 -1
#2 8
#3 6
#4 -1
#5 31
#6 14
#7 -1
#8 -1
#9 7
#10 28
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B01_가장큰합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String temp;
        int n, m, mx;
        int[] arr;
        for(int t=1; t<=T; t++) {
            System.out.print("#" + t + " ");
            temp = br.readLine();
            n = Integer.parseInt(temp.split(" ")[0]);
            m = Integer.parseInt(temp.split(" ")[1]);

            temp = br.readLine();
            arr = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();

            mx = -1;

            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(arr[i] + arr[j] <= m && arr[i] + arr[j] > mx) {
                        mx = arr[i] + arr[j];
                    }
                }
            }

            System.out.println(mx);

        }
    }
}

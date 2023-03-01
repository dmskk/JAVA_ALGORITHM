package A04_1완전탐색;

/* 문제
대학원생 유니는 학생들의 과제를 채점하고 있다.
고된 대학원 생활의 작은 재미를 찾고 싶었던 유니는 학생들 중 가장 점수가 높은 학생의 수와 가장 높은 점수를 가진 학생의 점수를 확인해보고자 한다.
당신은 교수다. 위 작업을 해주는 프로그램을 작성해 유니의 작은 즐거움을 빼앗아보자.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다.
각 테스트케이스의 첫째 줄에 학생의 수 N과 과제의 문제 수 M이 주어진다.
각 테스트케이스의 둘째 줄부터 N줄에 걸쳐 각 학생의 과제 결과가 주어진다.
과제 결과는 1 혹은 0이 M개 주어지는데, 각 수는 이 학생이 해당 문제를 정확하게 풀었는지 아닌지를 의미한다.
정확하게 풀었다면 1, 풀지 못했다면 0으로 주어진다.
모든 문제의 점수는 1점이다.
( 1 ≤ T ≤ 10, 2 ≤ N ≤ 20, 2 ≤ M ≤ 20 )
 */

/* 출력
각 테스트 케이스마다 "#" 과 테스트케이스의 번호(1부터 시작)를 출력한 뒤
해당 케이스에서 점수가 가장 높은 학생의 수와 점수가 가장 높은 학생의 점수를 공백으로 구분하여 출력한다.
 */

/*
예제 입력
10
5 5
1 1 1 0 0
0 1 0 1 1
0 1 1 0 0
1 1 0 1 1
0 0 1 0 0
5 7
0 1 0 0 1 1 0
1 0 1 0 0 0 1
0 1 1 1 0 1 0
1 0 0 1 1 0 1
0 0 1 0 1 0 1
4 5
1 0 0 1 0
0 1 1 1 0
1 1 1 0 0
0 1 0 1 1
5 5
1 1 0 0 0
0 1 0 0 0
1 0 1 0 0
0 0 1 0 0
1 0 1 0 1
5 7
0 1 0 0 0 1 0
1 0 1 0 1 0 0
1 0 0 1 1 1 1
1 0 1 0 0 0 0
0 1 0 1 1 0 0
5 6
0 1 1 1 0 0
0 1 0 1 1 0
1 1 1 0 0 0
0 0 0 1 0 0
1 1 0 1 0 0
3 6
0 0 1 1 0 1
0 0 0 0 0 1
0 0 0 0 1 0
3 6
0 0 1 1 1 0
1 1 0 0 1 1
0 1 0 0 1 0
5 6
1 0 1 1 0 1
0 0 0 1 0 1
0 0 1 1 1 1
1 1 0 1 0 0
0 1 0 1 1 0
4 7
0 0 1 0 0 1 1
1 0 0 1 1 0 1
0 0 0 0 0 0 0
0 1 0 0 1 0 1


예제 출력
#1 1 4
#2 2 4
#3 3 3
#4 1 3
#5 1 5
#6 4 3
#7 1 3
#8 1 4
#9 2 4
#10 1 4
 */

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class B02_채점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String temp = "";
        String[] arr;
        int n, cnt, mx, sum;

        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
            sb.append("#").append(t).append(" ");

            temp = br.readLine();
            n = Integer.parseInt(temp.split(" ")[0]);
            cnt = 0;
            mx = 0;

            for(int i=1; i<=n; i++) {
                sum = 0;
                arr = br.readLine().split(" ");
                for(String s : arr) {
                    sum += Integer.parseInt(s);
                }

                if(sum > mx) {
                    mx = sum;
                    cnt = 1;
                } else if(sum == mx) {
                    cnt++;
                }
            }

            sb.append(cnt).append(" ").append(mx).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

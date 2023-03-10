package algorithm_jobs.A02_2배열;

/* 문제
뒤집기 게임의 룰은 다음과 같다.

    1. 뒤집기 게임을 진행할 맵과 뒤집기 횟수 N이 주어진다.
    2. 뒤집기 행위는 뒤집을 원소가 1이면 0으로 만들고, 0이면 1로 만든다는 뜻이다.
    3. 첫번째 뒤집을 때는 1행의 원소들과 1열의 원소들을 모두 뒤집는다.
       두번째 뒤집을 때는 2행의 원소들과 2열의 원소들을 모두 뒤집는다.
       마찬가지로 i번째 뒤집을 때는 i행의 원소들과 i열의 원소들을 모두 뒤집는다.
       이렇게 총 N번의 뒤집기를 한다. (행과 열의 번호는 1번부터 시작한다.)

10×10크기 맵의 상태와 N이 주어졌을 때 뒤집기 게임을 모두 시행하고 난 뒤의 맵을 출력하는 프로그램을 작성해보자
 */

/* 입력
입력 첫째 줄에는 뒤집을 횟수 N이 주어진다. N은 10 이하의 자연수이다.
둘째 줄에는 10×10크기 맵의 상태가 주어진다.
 */

/* 출력
뒤집기 게임을 하고난 뒤의 맵의 상태를 출력한다.
 */

/*
예제 입력
1
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0

예제 출력
1 1 1 1 1 1 1 1 1 1
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
 */

/*
예제 입력
2
0 0 1 1 1 0 0 1 1 1
1 0 1 0 1 0 0 1 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 1 0 1 0 0 1 0 0
1 0 0 0 0 0 0 0 0 0
0 0 1 1 1 0 0 1 1 1
1 0 0 0 0 0 0 0 0 0

예제 출력
1 0 0 0 0 1 1 0 0 0
1 1 0 1 0 1 1 0 1 1
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 1 0 1 0 0 1 0 0
0 1 0 0 0 0 0 0 0 0
1 1 1 1 1 0 0 1 1 1
0 1 0 0 0 0 0 0 0 0
 */

import java.io.*;
import java.util.StringTokenizer;
public class D04_행렬뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];

        for(int i=1; i<=10; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=10; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=10; j++){
                arr[i][j] = arr[i][j] == 0 ? 1 : 0;
            }
            for(int j=1; j<=10; j++){
                arr[j][i] = arr[j][i] == 0 ? 1 : 0;
            }
            arr[i][i] = arr[i][i] == 0 ? 1 : 0;
        }

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

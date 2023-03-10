package algorithm_jobs.A02_2배열;

/* 문제
영팔이는 숫자 0과 8을 굉장히 좋아하는 아이이다.
그 이유는 숫자가 좌우로 뒤집어져도 똑같이 생겼기 때문이라고 한다.
영팔이는 숫자 0과 8의 매력을 사람들에게 전파하기 위해 유리로된 N×M타일에 0과 8들을 잔뜩 써놓았다.
이제 영팔이는 0과 8로된 숫자들은 좌우로 뒤집어도 여전히 0과 8들이라는 것을 보여주려고 한다.
 */

/* 입력
a첫째줄에는 자연수 N, M이 주어진다.
N은 타일행렬의 행의 개수, M은 타일행렬의 열의 수를 나타낸다.
N과 M은 100 이하의 자연수이다.
둘째줄부터 N개의 줄에 걸쳐, 타일행렬의 정보를 나타내는 0과 8들이 주어진다.
 */

/* 출력
주어진 타일행렬을 좌우로 뒤집어 출력한다.
 */

import java.io.*;
import java.util.StringTokenizer;

/*
예제 입력
3 3
0 8 0
8 8 0
0 0 8

예제 출력
0 8 0
0 8 8
8 0 0
 */
public class D03_eightnine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[200][300];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for(int i=0; i<n; i++) {
            for(int j=m-1; j>=0; j--) {
                sb.append(arr[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

package algorithm_jobs.A02_2배열;

/* 문제
지뢰찾기라는 게임은 맵에서 지뢰들이 어디에 있는지 유추해내는 게임이다.
이 게임 프로그램은 플레이어가 어떤 지점을 클릭했을 때 그 지점 주변(상, 하, 좌, 우, 대각선, 총 8곳)에 지뢰가 몇개가 있는지를 알려준다.

플레이어는 가장 적은 클릭을 통해, 지뢰들이 어디에 있는지를 유추해 내는 것이 목적인 게임이다.
중간에 지뢰가 있는 지점을 클릭하면 게임오버된다.

이때 어떤 지점을 클릭했을 때, 주변에 몇개의 지뢰들이 존재하는지를 출력하는 프로그램을 작성해보자
 */

/* 입력
첫째 줄에 게임의 맵의 크기를 나타내는 정수 N과 M이 주어진다.
N은 맵의 행 수, M은 맵의 열 수를 나타낸다. N, M은 5이상 100이하의 수이다.

둘째 줄에는 플레이어가 클릭한 지점의 위치 X와 Y가 주어진다.
X는 행 번호, Y는 열 번호를 나타낸다. (행 번호는 1이상 N이하, 열 번호는 1이상 M이하의 수이다.)

셋째 줄부터 N줄에 걸쳐 NxM 게임 맵의 상태가 주어진다.
이때 0은 지뢰가 없는 지점을 1은 지뢰가 있는 지점을 나타낸다.
 */

/* 출력
클릭된 지점 주변에 있는 지뢰의 개수를 출력한다. 클릭된 지점이 지뢰가 있는 지점이면 game over를 출력한다.
 */

/*
예제 입력
9 8
4 5
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 0 0 0 0 1 0 0
0 0 0 1 0 1 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
예제 출력
4
 */

import java.util.Scanner;

/* 예제 입력
9 8
4 6
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 0 0 0 0 1 0 0
0 0 0 1 0 1 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0
예제 출력
game over
 */
public class A03_mine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] arr = new int[110][110];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        if(arr[x][y] == 1) System.out.println("game over");
        else {
            sum += arr[x-1][y-1] + arr[x-1][y] + arr[x-1][y+1]
                    + arr[x][y-1] + arr[x][y+1]
                    + arr[x+1][y-1] + arr[x+1][y] + arr[x+1][y+1];
            System.out.println(sum);
        }
    }
}

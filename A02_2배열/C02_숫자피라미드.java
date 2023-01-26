package A02_2배열;

/* 문제
N과 시작 숫자 S가 주어지면 숫자 피라미드를 만드는 프로그램을 작성하시오.
예를 들어, N이 5이고 S가 3 이라면, 그 숫자 피라미드는 다음과 같다.

    3
   456
  21987
 3456789
987654321

· 시작 숫자 S는 꼭대기부터 1씩 증가한다.
· 시작 행의 번호가 1번이라고 했을때, 짝수번째 행은 왼쪽에서 오른쪽으로 1씩 증가하도록 적고, 홀수번째 행은 거꾸로 적는다.
· 숫자가 만약 10이 될 경우, 1로 바꾸고 다시 증가한다.
 */

/* 입력
입력의 첫 번째 줄에 N과 시작 숫자 S가 주어진다. ( 1≤N≤100, 1 ≤S≤ 9)
 */

/* 출력
첫 번째 줄부터 숫자 피라미드를 출력한다. (각 줄에 존재하는 공백의 개수와 숫자의 개수를 정확하게 확인해주시바랍니다.)
 */

/*
예제 입력
5 3
예제 출력
    3
   456
  21987
 3456789
987654321
 */

import java.util.Scanner;

public class C02_숫자피라미드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int start = sc.nextInt();
        int[][] arr = new int[10010][10010];

        for(int i=0; i<line; i++) {
            if(i != 0 && i % 2 == 0) {
                for(int j=2*i; j>=0; j--) {
                    arr[i][j] = start++;
                    if(start == 10) start = 1;
                }
            } else {
                for(int j=0; j<2*i+1; j++) {
                    arr[i][j] = start++;
                    if(start == 10) start = 1;
                }
            }
        }

        for(int i=0; i<line; i++) {
            for(int j=0; j<line-1-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}

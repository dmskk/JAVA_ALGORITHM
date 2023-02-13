package A02_2배열;

/* 문제
동굴에 N명의 사람들이 1번부터 번호를 부여받은채로 둘러앉아있다.
리더가 숫자 K를 말한다. 이때 K는 N보다 같거나 작다.
그러면 순서대로 1부터 K까지 세다가 K번째로 앉아있는 사람을 제거한다.
한 사람이 나가면 나머지 사람들로 원을 이루어 방금 탈락한 사람 바로 다음에 앉아있는 사람부터 다시 숫자를 1부터 K까지 센다.
그리고 모든 사람들이 탈락할 때까지 반복한다. 이때 각 사람들은 각자 자신의 번호가 있기에 탈락한 번호들의 수열이 있을 것이다.
이를 요세푸스 수열이라고 부른다. 예를 들어 N=5이고, K=3이면, 요세푸스 수열은 3,1,5,2,4가 된다.
유니는 이 이야기를 읽고 N과 K가 주어졌을 때 마지막으로 탈락하는 두 명의 사람의 번호를 구하는 프로그램을 설계하기로 했다.
 */

/* 입력
첫째 줄에 N과 K가 주어진다. (1<=K<=1000, 2<=N<=1000)
 */

/* 출력
요세푸스 수열의 n-1번째 탈락자와 n번째 탈락자의 번호를 순서대로 출력한다.
 */

/*
예제 입력
7 4

예제 출력
3 2
 */

/*
예제 입력
5 3

예제 출력
2 4
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class D05_JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[n];
        int idx = 0;
        IntStream.range(1, n+1).forEach(i -> q.add(i));

        int cnt = k;
        while(!q.isEmpty()) {
            cnt--;
            if(cnt == 0) {
                cnt = k;
                arr[idx++] = q.poll();
            } else {
                int num = q.poll();
                q.add(num);
            }
        }

        System.out.println(arr[n-2] + " " + arr[n-1]);
    }
}

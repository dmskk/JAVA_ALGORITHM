package algorithm_jobs.A03_1문자열;

/* 문제
지니는 토종 한국인이다. 영어를 못하는지, 하지 않는 것인지는 미스테리다.

영어시간에 선생님은 숫자와 알파벳 소문자가 혼합된 글자를 N개 줄로 구분 지어 내주었다.
그리고 a(1)->z(26)까지 매칭시키라 하셨다. 영어를 싫어하는 지니는 선생님이 시킨 일은 무시하고 문자열에서 연속된 숫자로 구성된 수를 뽑아서 비내림차순으로 정렬해 제출할 것이다. 0으로 시작하는 수는 의미 없는 0을 모두 지워서 적는다.

지니가 제출할 수열을 구하는 프로그램을 작성하시오.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다..

각 테스트케이스의 첫 줄에 N이 주어진다.

각 테스트케이스의 두번째 줄부터 N줄에 걸쳐 지니가 받은 문자열들이 주어진다. 모든 문자열의 길이는 100 이하다.

( 1 ≤ T ≤ 10, 1 ≤ N ≤ 100 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호를 출력하고 한 줄 개행한 뒤, 지니가 제출할 수열을 출력한다.
 */

/*
예제 입력
5
5
1sgotfkt
yt84
c93cyztn
wpyns7e4
5lub3
3
mhv8qy1
5lyn4
u9u0jk5qvm
5
lbue5
rgib
i9jfhwe
zfcp
oet6i
5
vwz06jgiz
nrq0
r21iszo9c0
kcffo
ihh9
5
xtiah0vu
0sz216
5vra9tp0
kjcsthz50u
ph2j


예제 출력
#1
1 3 4 5 7 84 93
#2
0 1 4 5 5 8 9
#3
5 6 9
#4
0 0 6 9 9 21
#5
0 0 0 2 5 9 50 216
 */

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class D05_알파벳사이숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Map<BigInteger, Integer> map;
        String[] arr;
        int T = Integer.parseInt(br.readLine());
        int N;
        for(int t=1; t<=T; t++) {
            map = new TreeMap<>();
            sb.append("#").append(t).append("\n");
            N = Integer.parseInt(br.readLine());
            for(int n=0; n<N; n++) {
                arr = br.readLine().split("[a-z]");
                for(String s : arr) {
                    if(!s.isEmpty()) {
                        BigInteger bi = new BigInteger(s);
                        map.put(bi, map.getOrDefault(bi, 0) + 1);
                    }
                }
            }
            for(Map.Entry<BigInteger, Integer> e : map.entrySet()) {
                for(int i=0; i<e.getValue(); i++) {
                    sb.append(e.getKey());
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

package algorithm_jobs.A03_1문자열;

/* 문제
유니는 압축된 문자열을 갖고 있다.

압축된 문자열이란 어떤 문자열에서 연속된 문자가 존재하면 그 문자들을 연속 등장 횟수와 해당 문자 하나로 바꿔서 만든 문자열을 말한다.

예를들어 원본 문자열이 AAABBBBBCAA였다면 3A5BC2A로 압축된다.
이는 A가 세 번 등장한 후 B가 다섯 번 등장하고, C가 한 번 A가 두 번 등장함을 의미한다.
여기서 C처럼 연속으로 한 번만 등장한 문자는 1을 적지 않는다.

압축된 문자열이 주어질 때 원본 문자열을 출력하는 프로그램을 작성하시오.

원본 문자열에서 10번 이상 연속으로 등장하는 문자는 없다는 것이 보장된다.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다..

각 테스트케이스의 첫 줄에 압축된 문자열이 주어진다. 압축된 문자열의 길이는 2,000 이하다.

( 1 ≤ T ≤ 10 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 원본 문자열을 출력한다.
 */

import java.io.*;

public class C01_문자열압축2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int t = 0;
        String str;
        char c;
        int num, d = '1' - 1;

        while (t++ < T) {
            sb.append("#" + t + " ");
            str = br.readLine();
            for(int i=0; i<str.length(); i++) {
                c = str.charAt(i);
                if(c > '1' && c <= '9') {
                    num = c - d;
                    for(int j=1; j<num; j++) {
                        sb.append(str.charAt(i+1));
                    }
                } else {
                    sb.append(c);
                }
            }

            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

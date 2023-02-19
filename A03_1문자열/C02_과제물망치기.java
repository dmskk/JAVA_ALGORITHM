package A03_1문자열;

/* 문제
유니와 지니는 과제를 하고 있다.

유니는 이 과제에서 지니보다 높은 점수를 받고 싶다.
하지만 지니는 항상 만점을 받기 때문에 유니가 아무리 과제를 잘 해도 지니보다 잘 보는 것은 불가능하다.

그래서 유니는 지니의 과제를 망치려고 한다.
문자열에 공백이라도 있으면 그 공백을 지워서 망치고 싶지만 안타깝게도 이번 과제의 결과물은 알파벳 대문자로만 구성된 문자열이다.
그래서 유니는 지니의 과제 결과물에서 모음을 모두 지워버리기로 했다.
여기서 모음이란 'A', 'E', 'I', 'O', 'U'를 의미한다.

지니의 과제 결과물이 주어질 때 모음을 모두 지운 문자열을 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다..
각 테스트케이스의 첫 줄에 지니의 과제 결과물이 주어진다. 이는 길이가 100 이하인 알파벳 대문자로만 구성된 문자열이다.
( 1 ≤ T ≤ 10 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 모음을 지운 문자열을 출력한다.
 */

/*
예제 입력
10
HFCIHHCDB
JJCCGEB
BHDEIGIGHEBBBDDFCFDG
BDGEJBBDIIJIGHHJ
DGCJCJGHGE
JIIGGJDJGFGIDE
FEBCBBDDDJBFHDJG
JFECFBIGHICIIBEICJ
HDBFIDIEB
FIEDHGIGGCFDIDEJFFEH

예제 출력
#1 HFCHHCDB
#2 JJCCGB
#3 BHDGGHBBBDDFCFDG
#4 BDGJBBDJGHHJ
#5 DGCJCJGHG
#6 JGGJDJGFGD
#7 FBCBBDDDJBFHDJG
#8 JFCFBGHCBCJ
#9 HDBFDB
#10 FDHGGGCFDDJFFH
 */

import java.io.*;

public class C02_과제물망치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        String str = "";

        for(int i=1; i<=t; i++) {
            str = br.readLine();
            str = str.replace("A", "");
            str = str.replace("E", "");
            str = str.replace("I", "");
            str = str.replace("O", "");
            str = str.replace("U", "");

            sb.append("#" + i + " " + str + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

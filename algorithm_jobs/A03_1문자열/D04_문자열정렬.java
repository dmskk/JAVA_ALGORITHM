package algorithm_jobs.A03_1문자열;

/* 문제
n개의 문자열이 주어질 때, 이 문자열을 사전순으로 빠른 순서대로 정렬하는 프로그램을 작성하시오.
 */

/* 입력
첫 번째 줄에 문자열의 개수 n이 주어진다 ( 1 ≤ n ≤ 100 )
그 후 n개의 줄에 대하여 정렬하고자 하는 문자열이 주어진다 ( 1 ≤ 문자열의 길이 ≤ 100 )
 */

/* 출력
문자열을 사전순으로 빠른 순서대로 정렬한 결과를 출력한다.
 */

/*
예제 입력
9
acid
apple
banana
acquire
cat
crop
crab
power
cat

예제 출력
acid
acquire
apple
banana
cat
cat
crab
crop
power
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D04_문자열정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(br.readLine());
        }
        Collections.sort(list);

        for(String s : list) {
            sb.append(s + "\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

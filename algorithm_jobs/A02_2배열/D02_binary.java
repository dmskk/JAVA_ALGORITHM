package algorithm_jobs.A02_2배열;

/* 문제
숫자를 입력 받아 이진수로 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫 번째 줄에 숫자를 입력 받는다. 숫자의 크기는 1,000보다 작거나 같다.
 */

/* 출력
첫째 줄에 숫자를 이진수로 바꾸어 출력한다.
 */

/*
예제 입력
14
예제 출력
1110
 */

/*
예제 입력
31
예제 출력
11111
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class D02_binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        long num = Long.parseLong(br.readLine());
        ArrayList<Long> arr = new ArrayList<>();

        for(long i=0; 0<num; i++) {
            long temp = num % 2;
            num /= 2;
            arr.add(temp);
        }

        Collections.reverse(arr);

        for(long temp:arr) {
            sb.append(temp);
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

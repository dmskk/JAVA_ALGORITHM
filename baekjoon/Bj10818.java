package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int mn = 10000000;
        int mx = -10000000;
        int num;

        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }


        StringBuilder sb = new StringBuilder().append(mn).append(" ").append(mx);
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

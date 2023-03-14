package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bj1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        LinkedList<Integer> que = new LinkedList<>();

        for(int i=1; i<=Integer.parseInt(input[0]); i++) {
            que.add(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            while(que.peek() != num) {
                int idx = que.indexOf(num);
                if(idx > que.size() / 2) {
                    que.addFirst(que.removeLast());
                } else {
                    que.addLast(que.removeFirst());
                }
                cnt++;
            }

            que.removeFirst();
        }

        System.out.println(cnt);
    }
}

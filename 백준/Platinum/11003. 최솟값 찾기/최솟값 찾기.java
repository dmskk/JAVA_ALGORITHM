import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Deque<Node> mydeque = new LinkedList<>();
            for(int i=0; i<N; i++) {
                int now = Integer.parseInt(st.nextToken());

                while(!mydeque.isEmpty() && mydeque.getLast().value > now) {
                    mydeque.removeLast(); //pop();
                }
                mydeque.addLast(new Node(now, i));

                // 범위 : i-L+1 ~ i
                // 범위에서 벗어난 값은 덱에서 제거
                if(mydeque.getFirst().index <= i-L) {
                    mydeque.removeFirst();
                }

                bw.write(mydeque.getFirst().value + " ");

            }

            bw.flush();
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}

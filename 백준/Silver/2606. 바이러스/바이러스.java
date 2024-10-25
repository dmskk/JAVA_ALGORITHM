import java.io.*;
import java.util.*;

public class Main {
    public static void putEdge(LinkedList<Integer>[] graph, int x, int y) {
        graph[x].add(y);
        graph[y].add(x);
    }

    public static Integer dfs(LinkedList<Integer>[] graph, boolean[] isVisited, int cur) {
        int result = 0;
        isVisited[cur] = true;

        for(int next : graph[cur]) {
            if(!isVisited[next]) {
                result += dfs(graph, isVisited, next);
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int computers = Integer.parseInt(br.readLine());
        int pairs = Integer.parseInt(br.readLine());

        LinkedList<Integer>[] graph = new LinkedList[computers+1];
        boolean[] isVisited = new boolean[computers+1];

        for(int i=0; i<=computers; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int i=0; i<pairs; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            putEdge(graph, x, y);
        }

        int result = dfs(graph, isVisited, 1);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
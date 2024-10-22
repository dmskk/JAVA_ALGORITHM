import java.util.*;

public class Main {
    public static void putEdge(LinkedList<Integer>[] graph, int x, int y) {
        graph[x].add(y);
        graph[y].add(x);
    }

    public static void resetIsVisited(boolean[] isVisited) {
        Arrays.fill(isVisited, false);
    }

    public static void dfs(LinkedList<Integer>[] graph, boolean[] isVisited, int cur, StringBuilder sb) {
        isVisited[cur] = true;
        sb.append(cur).append(" ");

        for(int next : graph[cur]) {
            if(!isVisited[next]) {
                dfs(graph, isVisited, next, sb);
            }
        }
    }

    public static void bfs(LinkedList<Integer>[] graph, boolean[] isVisited, int cur) {
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(cur);
        isVisited[cur] = true;

        while(!q.isEmpty()) {
            int nodeIndex = q.poll();
            sb.append(nodeIndex);
            sb.append(" ");

            for(int next : graph[nodeIndex]) {
                if(!isVisited[next]) {
                    isVisited[next] = true;
                    q.offer(next);
                }
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        LinkedList<Integer>[] linkedList = new LinkedList[n+1];
        boolean[] isVisited = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            linkedList[i] = new LinkedList<>();
        }

        for(int i=0; i<m; i++) {
            putEdge(linkedList, sc.nextInt(), sc.nextInt());
        }

        for(int i=0; i<=n; i++) {
            Collections.sort(linkedList[i]);
        }

        StringBuilder dfsResult = new StringBuilder();
        dfs(linkedList, isVisited, v, dfsResult);
        System.out.println(dfsResult.toString());

        resetIsVisited(isVisited);
        bfs(linkedList, isVisited, v);
    }
}
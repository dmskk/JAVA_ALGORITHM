import java.util.*;

public class Main {
    private static int rows, cols;
    private static final int[] MOVE_COL = {1, 0, -1, 0};
    private static final int[] MOVE_ROW = {0, 1, 0, -1};

    public static int bfs(int[][] mirror) {
        boolean[][] isVisited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {0, 0, 1}); // {row, col, count}
        isVisited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int cnt = current[2];

            if(row == rows-1 && col == cols-1) {
                return cnt;
            }

            for(int i=0; i<4; i++) {
                int newRow = row + MOVE_ROW[i];
                int newCol = col + MOVE_COL[i];

                if( newRow >= 0 && newRow < rows
                    && newCol >= 0 && newCol < cols
                    && mirror[newRow][newCol] == 1
                    && !isVisited[newRow][newCol]
                ) {
                    queue.add(new int[] {newRow, newCol, cnt+1});
                    isVisited[newRow][newCol] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        sc.nextLine();

        int[][] mirror = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            String line = sc.nextLine();
            for(int j=0; j<cols; j++) {
                mirror[i][j] = line.charAt(j) - '0';
            }
        }

        int result = bfs(mirror);
        System.out.println(result);
    }
}
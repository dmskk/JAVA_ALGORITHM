import java.util.*;

public class Main {
    private static int rows, cols;
    private static final int[] DIRECTION_X  = {1, 0, -1, 0};
    private static final int[] DIRECTION_Y  = {0, 1, 0, -1};

    public static int bfs(int[][] grid, Queue<int[]> queue, int ripeCount) {
        int days = 0;
        int totalTomatoes = rows * cols;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int day = current[2];

            days = Math.max(days, day);

            for (int i = 0; i < 4; i++) {
                int newRow = row + DIRECTION_Y[i];
                int newCol = col + DIRECTION_X[i];

                if (newRow >= 0 && newRow < rows
                        && newCol >= 0 && newCol < cols
                        && grid[newRow][newCol] == 0
                ) {
                    grid[newRow][newCol] = 1;
                    queue.add(new int[]{newRow, newCol, day + 1});
                    ripeCount++;
                }
            }
        }
        return (ripeCount == totalTomatoes) ? days : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cols = sc.nextInt();
        rows = sc.nextInt();

        Queue<int[]> queue = new LinkedList<>();
        int ripeCount = 0;
        int emptyCells = 0;

        int[][] grid = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                int tomato = sc.nextInt();
                grid[i][j] = tomato;

                if(tomato == 1) {
                    queue.add(new int[] {i, j, 0}); // {row, col, days}
                    ripeCount++;
                } else if(tomato == -1) {
                    emptyCells++;
                }
            }
        }

        int result = bfs(grid, queue, ripeCount + emptyCells);
        System.out.println(result);
    }
}
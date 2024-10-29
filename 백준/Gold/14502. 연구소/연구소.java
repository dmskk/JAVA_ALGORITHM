import java.util.*;

public class Main {
    private static int rows, cols;
    private static final int[] MOVE_COL = {1, 0, -1, 0};
    private static final int[] MOVE_ROW = {0, 1, 0, -1};
    private static List<int[]> emptySpaces = new ArrayList<>();
    private static List<int[]> virusLocations = new ArrayList<>();

    public static int getMaxSafeArea(int[][] lab) {
        int maxSafeArea = 0;

        for (int i = 0; i < emptySpaces.size(); i++) {
            for (int j = i + 1; j < emptySpaces.size(); j++) {
                for (int k = j + 1; k < emptySpaces.size(); k++) {
                    int[][] tempLab = deepCopy(lab);
                    tempLab[emptySpaces.get(i)[0]][emptySpaces.get(i)[1]] = 1;
                    tempLab[emptySpaces.get(j)[0]][emptySpaces.get(j)[1]] = 1;
                    tempLab[emptySpaces.get(k)[0]][emptySpaces.get(k)[1]] = 1;

                    int safeArea = calculateSafeArea(tempLab);
                    maxSafeArea = Math.max(maxSafeArea, safeArea);
                }
            }
        }
        return maxSafeArea;
    }

    private static int calculateSafeArea(int[][] lab) {
        Queue<int[]> queue = new LinkedList<>(virusLocations);
        boolean[][] isVisited = new boolean[rows][cols];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            for (int i = 0; i < 4; i++) {
                int newRow = row + MOVE_ROW[i];
                int newCol = col + MOVE_COL[i];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                        && !isVisited[newRow][newCol] && lab[newRow][newCol] == 0) {
                    lab[newRow][newCol] = 2;
                    queue.add(new int[]{newRow, newCol});
                    isVisited[newRow][newCol] = true;
                }
            }
        }

        int safeAreaCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (lab[i][j] == 0) {
                    safeAreaCount++;
                }
            }
        }
        return safeAreaCount;
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            copy[i] = Arrays.copyOf(original[i], cols);
        }
        return copy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] lab = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                lab[i][j] = sc.nextInt();
                if (lab[i][j] == 0) {
                    emptySpaces.add(new int[]{i, j});
                } else if (lab[i][j] == 2) {
                    virusLocations.add(new int[]{i, j});
                }
            }
        }

        System.out.println(getMaxSafeArea(lab));
    }
}
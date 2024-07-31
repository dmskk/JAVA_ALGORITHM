import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] D = new int[n+1][n+1];
            for(int i=1; i<=n; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=1; j<=n; j++) {
                    D[i][j] = D[i-1][j] + D[i][j-1] + Integer.parseInt(st.nextToken())
                             - D[i-1][j-1];
                }
            }

            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                int X1 = Integer.parseInt(st.nextToken());
                int Y1 = Integer.parseInt(st.nextToken());
                int X2 = Integer.parseInt(st.nextToken());
                int Y2 = Integer.parseInt(st.nextToken());

                int result = D[X2][Y2] - D[X1-1][Y2] - D[X2][Y1-1] + D[X1-1][Y1-1];
                System.out.println(result);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }


}

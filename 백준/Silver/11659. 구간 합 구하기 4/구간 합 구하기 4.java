import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] d = new int[n+1];
            for(int i=1; i<=n; i++) {
                d[i] = d[i-1] + Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<m; i++) {
                st = new StringTokenizer(br.readLine());
                int I = Integer.parseInt(st.nextToken());
                int J = Integer.parseInt(st.nextToken());
                int result = d[J] - d[I-1];
                System.out.println(result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }


}

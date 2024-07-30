import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            st = new StringTokenizer(br.readLine());
            int n = Integer.valueOf(st.nextToken());
            int m = Integer.valueOf(st.nextToken());

            long[] s = new long[n];
            long[] cnt = new long[m];
            st = new StringTokenizer(br.readLine());
            s[0] = Integer.valueOf(st.nextToken()) % m;
            cnt[(int)s[0]]++;
            for(int i = 1; i < n; i++) {
                s[i] = (s[i-1] + Integer.valueOf(st.nextToken())) % m;
                cnt[(int)s[i]]++;
            }

            long result = cnt[0];
            for(int i = 0; i < m; i++) {
                if(cnt[i] > 1) {
                    result += (cnt[i]*(cnt[i]-1)) / 2;
                }
            }
            System.out.println(result);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }


}

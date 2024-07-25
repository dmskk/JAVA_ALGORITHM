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
			
			int[][] sum = new int[n+1][n+1];
			for(int i=0; i<=n; i++) {
				if(i !=0) st = new StringTokenizer(br.readLine());
				for(int j=0; j<=n; j++) {
					if(i==0 || j==0) {
						sum[i][j] = 0;
						continue;
					}
					sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + Integer.valueOf(st.nextToken());
				}
			}
			
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(br.readLine());
				int x1 = Integer.valueOf(st.nextToken());
				int y1 = Integer.valueOf(st.nextToken());
				int x2 = Integer.valueOf(st.nextToken());
				int y2 = Integer.valueOf(st.nextToken());
				
				System.out.println(sum[x2][y2]-sum[x2][y1-1]-sum[x1-1][y2]+sum[x1-1][y1-1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();			
		}
	}
}

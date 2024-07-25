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
			
			st = new StringTokenizer(br.readLine());
			int[] sum = new int[n+1];
			sum[0] = 0;
			for(int i=1; i<=n; i++) {
				sum[i] = sum[i-1] + Integer.valueOf(st.nextToken());
			}
			
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(br.readLine());
				System.out.println(0-sum[Integer.valueOf(st.nextToken())-1]+sum[Integer.valueOf(st.nextToken())]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();			
		}
	}
}

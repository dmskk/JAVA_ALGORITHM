import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.valueOf(br.readLine());
			String[] scores = br.readLine().split(" ");
			int max = 0;
			int sum = 0;
			
			for(int i=0; i<n; i++) {
				int temp = Integer.valueOf(scores[i]);
				if(temp > max) max = temp;
				sum += temp;
			}
			
			System.out.println(sum*100.0/max/n);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			br.close();			
		}
	}
}

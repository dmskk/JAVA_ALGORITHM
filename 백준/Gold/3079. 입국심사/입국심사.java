import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        long[] secs = new long[n];
        for(int i=0; i<n; i++) {
            secs[i] = sc.nextLong();
        }

        long left = 0;
        long right = Arrays.stream(secs).max().getAsLong() * m;
        long result = right;

        while(left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;

            for(long sec : secs) {
                cnt += mid / sec;
                
                if(cnt >= m) {
                    break;
                }
            }

            if(cnt >= m) {
                result = Math.min(result, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(result);
    }
}
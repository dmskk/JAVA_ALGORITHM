import javax.management.remote.JMXServerErrorException;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mettings = new int[n][2];

        for(int i=0; i<n; i++) {
            mettings[i][0] = sc.nextInt();
            mettings[i][1] = sc.nextInt();
        }

        Arrays.sort(mettings, (a, b) -> {
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int end = 0;
        int cnt = 0;

        for(int[] meeting : mettings) {
            if(meeting[0] >= end) {
                end = meeting[1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

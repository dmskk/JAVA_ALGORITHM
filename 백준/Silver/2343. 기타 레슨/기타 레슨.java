import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] videos = new int[n];

        for(int i=0; i<n; i++) {
            videos[i] = sc.nextInt();
        }

        int left = Arrays.stream(videos).max().getAsInt();
        int right = Arrays.stream(videos).sum();
        int result = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int sum = 0;

            for(int i=0; i<n; i++) {
                if(sum + videos[i] <= mid) {
                    sum += videos[i];
                } else {
                    sum = videos[i];
                    cnt++;
                }
            }

            if(cnt > m) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid;
            }
        }
        System.out.println(result);
    }
}
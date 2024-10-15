import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] houses = new int[n];
        for(int i=0; i<n; i++) {
            houses[i] = sc.nextInt();
        }

        Arrays.sort(houses);

        int left = 1;
        int right = houses[n-1] - houses[0];
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int count = 1;
            int lastInstalled = houses[0];

            for(int i=0; i<n; i++) {
                if(houses[i] - lastInstalled >= mid) {
                    count++;
                    lastInstalled = houses[i];
                }
            }

            if(count >= c) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
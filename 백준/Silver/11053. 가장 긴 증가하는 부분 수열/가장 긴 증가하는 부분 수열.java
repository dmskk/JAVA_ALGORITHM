import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] dp = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1; // 초기화: 모든 수는 자기 혼자 1개 길이의 수열
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int result = 0;
        for (int length : dp) {
            result = Math.max(result, length);
        }

        System.out.println(result);
    }
}
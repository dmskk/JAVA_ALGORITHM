import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum = arr[0];
        int[] d = new int[n];
        d[0] = arr[0];
        for(int i=1; i<n; i++) {
            d[i] = d[i-1] + arr[i];
            sum += d[i];
        }

        System.out.println(sum);

    }
}

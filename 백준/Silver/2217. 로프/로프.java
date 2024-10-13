import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int max = 0;

        for(int i=0; i<n; i++) {
            w[i] = sc.nextInt();
        }

        Arrays.sort(w);

        for(int i=0; i<n; i++) {
            int weight = w[i] * (n-i);
            if(max < weight) {
                max = weight;
            }
        }

        System.out.println(max);
    }
}

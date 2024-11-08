import java.util.*;

public class Main {

    private static int cnt;
    private static int target;
    private static void sum(int total) {
        if(total == target) {
            cnt++;
            return;
        }

        if(total > target) {
            return;
        }

        for(int i=1; i<=3; i++) {
            sum(total+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            target = sc.nextInt();
            cnt = 0;
            sum(0);
            System.out.println(cnt);
        }
    }
}
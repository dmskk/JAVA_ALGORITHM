import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> cards = new HashMap<>();
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(cards.containsKey(num)) {
                cards.replace(num, cards.get(num) + 1);
            } else {
                cards.put(num, 1);
            }
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<m; i++) {
            int num = sc.nextInt();
            int ans = 0;
            if(cards.containsKey(num)) {
                ans = cards.get(num);
            }
            sb.append(ans);
            sb.append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
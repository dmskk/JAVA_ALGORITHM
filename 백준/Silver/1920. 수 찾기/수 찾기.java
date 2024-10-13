import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            map.put(sc.nextInt(), i);
        }

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++) {
            boolean flag = map.containsKey(sc.nextInt());
            sb.append(flag ? 1 : 0).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sortedArr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sortedArr[i] = num;
        }

        Arrays.sort(sortedArr);
        int idx = 0;
        for(int i=0; i<n; i++) {
            if(!map.containsKey(sortedArr[i])) {
                map.put(sortedArr[i], idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
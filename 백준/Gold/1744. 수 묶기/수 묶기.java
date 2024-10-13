import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        int ones = 0;
        int zeros = 0;

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(num > 1) {
                plus.add(num);
            } else if(num == 1) {
                ones++;
            } else if(num == 0) {
                zeros++;
            } else {
                minus.add(num);
            }
        }

        long totalCost = 0;

        while (plus.size() > 1) {
            totalCost += plus.poll() * plus.poll();
        }
        if(!plus.isEmpty()) {
            totalCost += plus.poll();
        }

        while (minus.size() > 1) {
            totalCost += minus.poll() * minus.poll();
        }

        if(!minus.isEmpty()) {
            if(zeros == 0) {
                totalCost += minus.poll();
            }
        }

        totalCost += ones;

        System.out.println(totalCost);
    }
}
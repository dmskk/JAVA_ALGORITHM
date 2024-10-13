import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> dots = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int[] nums = new int[2];
            nums[0] = sc.nextInt();
            nums[1] = sc.nextInt();
            dots.add(nums);
        }

        Collections.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        for (int[] dot : dots) {
            System.out.println(dot[0] + " " + dot[1]);
        }
    }
}
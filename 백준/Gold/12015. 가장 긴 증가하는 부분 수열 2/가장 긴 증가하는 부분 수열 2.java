import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] lis = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int length = 0;

        for(int i=0; i<n; i++) {
            int num = arr[i];

            int pos = Arrays.binarySearch(lis, 0, length, num);
            if(pos < 0) {
                pos = -(pos + 1);
            }
            lis[pos] = num;

            if(pos == length) {
                length++;
            }
        }

        System.out.println(length);
    }
}
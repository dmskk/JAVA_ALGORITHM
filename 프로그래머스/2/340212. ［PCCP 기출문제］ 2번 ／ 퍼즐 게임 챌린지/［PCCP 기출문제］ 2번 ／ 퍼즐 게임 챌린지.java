import java.util.*;

public class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;

        int max = Arrays.stream(diffs).max().getAsInt();
        int min = Arrays.stream(diffs).min().getAsInt();

        int left = min;
        int right = max;

        while(left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for(int i=0; i<diffs.length; i++) {
                if(diffs[i] <= mid) {
                    sum += times[i];
                } else {
                    sum += (diffs[i] - mid) * (times[i] + times[i-1]) + times[i];
                }
            }

            if(sum <= limit) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}

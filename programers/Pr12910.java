package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pr12910 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {5, 9, 7, 10};
        int[] result = s.solution(arr, 5);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = new int[arr.length];
            int idx = -1;
            for(int i : arr) {
                if(i % divisor == 0) {
                    answer[++idx] = i;
                }
            }

            if(idx == -1) {
                return new int[] {-1};
            }

            answer = Arrays.copyOf(answer, idx + 1);
            Arrays.sort(answer);

            return answer;
        }
    }
}

package programers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.IntStream;

public class Pr12906 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.solution(new int[] {1,1,3,3,0,1,1});
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            Stack<Integer> st = new Stack<>();
            st.push(arr[0]);

            for(int i = 1; i < arr.length; i++) {
                if(st.peek() != arr[i]) {
                    st.push(arr[i]);
                }
            }
            return st.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

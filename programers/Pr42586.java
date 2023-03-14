package programers;

import java.util.*;
import java.util.stream.IntStream;

public class Pr42586 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] result = s.solution(progresses, speeds);
        System.out.println(Arrays.toString(result));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();

            int cnt = 0;
            int p = 0;
            while(p < progresses.length) {
                if(progresses[p] < 100) {
                    if(p > 0) {
                        answer.add(cnt);
                    }
                    cnt = 0;
                }

                while (progresses[p] < 100) {
                    for(int i = p; i < progresses.length; i++) {
                        progresses[i] += speeds[i];
                    }
                }

                cnt++;
                p++;
            }

            answer.add(cnt);

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

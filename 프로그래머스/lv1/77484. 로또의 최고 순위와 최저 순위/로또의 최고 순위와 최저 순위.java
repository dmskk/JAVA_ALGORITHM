import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        
        Set<Integer> set = new HashSet<>();
        for(int i : win_nums) {
            set.add(i);
        }
        
        int zero = 0;
        int cnt = 0;
        for(int i : lottos) {
            if(i == 0) {
                zero++;
                continue;
            }
            if(set.contains(i)) cnt++;
        }
        
        int[] answer = new int[2];
        
        if(cnt + zero >= 2) {
            answer[0] = 7 - (cnt + zero);
        } else {
            answer[0] = 6;
        }
        
        if(cnt >= 2) {
            answer[1] = 7 - cnt;
        } else {
            answer[1] = 6;
        }
        
        return answer;
    }
}
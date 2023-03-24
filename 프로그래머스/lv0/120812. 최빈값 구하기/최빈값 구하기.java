class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int mx = 0;
        int[] cnt = new int[1000];
        
        for(int i : array) {
            cnt[i]++;
            if(cnt[i] > mx) {
                mx = cnt[i];
                answer = i;
            }
            else if(cnt[i] == mx) {
                answer = -1;
            }
        }
        
        
        return answer;
    }
}
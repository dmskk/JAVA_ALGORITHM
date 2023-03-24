class Solution {
    public int solution(int n) {
        int r = gcd(n, 6);
        return n / r;
    }
    
    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
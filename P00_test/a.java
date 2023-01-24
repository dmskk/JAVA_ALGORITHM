package P00_test;

public class a {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};

        System.out.println(solution(arr));
    }

    public static boolean solution(int[] arr) {
        boolean answer = true;
        int[] prefix = new int[100010];

        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= arr.length && prefix[arr[i]] == 0) {
                cnt++;
                prefix[i]++;
            } else {
                answer = false;
                break;
            }
        }

        if(cnt != arr.length) answer = false;

        return answer;
    }
}

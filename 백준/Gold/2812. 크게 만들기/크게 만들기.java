import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String num = sc.next();

        Deque<Character> stack = new ArrayDeque<>();

        int toRemove = k;

        for(int i=0; i<n; i++) {
            char digit = num.charAt(i);

            while(!stack.isEmpty() && toRemove > 0 && stack.peekLast() < digit) {
                stack.pollLast();
                toRemove--;
            }

            stack.addLast(digit);
        }

        StringBuilder result = new StringBuilder();
        while(stack.size() > n-k) {
            stack.pollLast();
        }

        for(char c : stack) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}
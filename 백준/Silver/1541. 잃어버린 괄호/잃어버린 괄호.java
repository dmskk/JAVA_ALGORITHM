import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fm = sc.nextLine();
        String[] minus = fm.split("-");

        int sum = 0;
        for(int i = minus.length - 1; i>=0; i--) {
            String[] plus = minus[i].split("\\+");
            int sub = 0;
            for(String s : plus) {
                sub += Integer.parseInt(s);
            }

            if (i > 0 || fm.startsWith("-")) {
                sum -= sub;
            } else {
                sum += sub;
            }
        }

        System.out.println(sum);
    }
}

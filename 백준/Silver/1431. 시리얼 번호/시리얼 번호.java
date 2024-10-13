import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                int sum1 = getDigitSum(o1);
                int sum2 = getDigitSum(o2);

                if (sum1 != sum2) {
                    return sum1 - sum2;
                }

                return o1.compareTo(o2);
            }

            private int getDigitSum(String s) {
                int sum = 0;
                for (char c : s.toCharArray()) {
                    if(Character.isDigit(c)) {
                        sum += c - '0';
                    }
                }
                return sum;
            }
        });

        StringBuilder sb = new StringBuilder();
        list.forEach(s -> {
            sb.append(s).append("\n");
        });

        System.out.println(sb.toString().trim());
    }
}
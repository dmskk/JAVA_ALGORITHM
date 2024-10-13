import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String[]> scores = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String line = sc.nextLine();
            String[] score = line.split(" ");
            scores.add(score);
        }

        Collections.sort(scores, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[1].equals(o2[1]) && o1[2].equals(o2[2]) && o1[3].equals(o2[3])) {
                    return o1[0].compareTo(o2[0]);
                } else if (o1[1].equals(o2[1]) && o1[2].equals(o2[2])) {
                    return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                } else if (o1[1].equals(o2[1])) {
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                } else {
                    return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
                }
            }
        });

        for (String[] score : scores) {
            System.out.println(score[0]);
        }
    }
}
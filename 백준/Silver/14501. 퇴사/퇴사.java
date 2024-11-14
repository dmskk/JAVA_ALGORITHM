import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int workingDays = Integer.parseInt(br.readLine());

        int[] serviceDays = new int[workingDays + 1]; // 상담 걸리는 일수
        int[] rewards = new int[workingDays + 1]; // 상담 보수
        int[] maxEarningsUntil = new int[workingDays + 1]; // 각 날까지의 최대 수익

        for (int i = 1; i <= workingDays; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            serviceDays[i] = Integer.parseInt(st.nextToken());
            rewards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= workingDays; i++) {
            // 상담을 시작하지 않는 경우 (전날까지의 최대 수익을 유지)
            maxEarningsUntil[i] = Math.max(maxEarningsUntil[i], maxEarningsUntil[i - 1]);

            int endDay = i + serviceDays[i] - 1; // 현재 상담이 끝나는 날

            // 상담을 수행할 수 있는 경우 (퇴사일을 넘지 않는 경우)
            if (endDay <= workingDays) {
                maxEarningsUntil[endDay] = Math.max(maxEarningsUntil[endDay], maxEarningsUntil[i - 1] + rewards[i]);
            }
        }

        // 전체 기간 동안의 최대 수익 찾기
        int maxTotalEarnings = 0;
        for (int i = 1; i <= workingDays; i++) {
            maxTotalEarnings = Math.max(maxTotalEarnings, maxEarningsUntil[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(maxTotalEarnings));

        bw.flush();
        bw.close();
        br.close();
    }
}

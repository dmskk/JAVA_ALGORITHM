package A02_2배열;

/* 문제
숫자를 입력 받아 이진수로 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫 번째 줄에 숫자를 입력 받는다. 숫자의 크기는 1,000보다 작거나 같다.
 */

/* 출력
첫째 줄에 숫자를 이진수로 바꾸어 출력한다.
 */

/*
예제 입력
14
예제 출력
1110
 */

import java.util.Scanner;

/*
예제 입력
31
예제 출력
11111
 */
public class D02_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[1010];
        int idx = 0;

        for(int i=0; ; i++) {
            arr[i] = num%2;
            num /= 2;
            if(num == 1) {
                arr[i+1] = 1;
                idx = i+1;
                break;
            }
        }

        for(int i=idx; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}

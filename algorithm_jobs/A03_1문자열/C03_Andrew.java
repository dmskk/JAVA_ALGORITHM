package algorithm_jobs.A03_1문자열;

/* 문제
유니는 자신의 친구 Andrew가 미국으로 간다는 소식을 들었다.
너무 속상했던 유니는 한동안 친구의 이름에 포함되어 있는 알파벳을 볼 수 없는 상태가 되어버렸다.
Alexander에게 온 입사 제안 메일 조차도 lx로 보아 기회를 놓쳐버렸다.
유니의 슬픔을 이해하기 위해 단어가 제시 되었을 때 유니는 어떻게 볼 것인지 출력하는 프로그램을 작성하시오.
 */

/* 입력
첫째 줄에 테스트케이스의 수 T가 주어진다.
각 테스트케이스의 첫 줄에 유니가 보는 문자열이 주어진다. 문자열은 알파벳 대문자로만 구성되어 있고, 길이는 100글자 이하다.
( 1 ≤ T ≤ 10 )
 */

/* 출력
각 테스트케이스마다 '#'과 테스트케이스의 번호, 공백을 출력한 뒤 유니에게 보이는 문자열을 출력한다.
 */

/*
예제 입력
5
WRDTLZROVFKYQYGA
RAQBLZGVHPP
QPMMCGMUIFCBJ
UYOIPIQZNVWNT
XWIASCJOPNDQPPBZULL

예제 출력
#1 TLZOVFKYQYG
#2 QBLZGVHPP
#3 QPMMCGMUIFCBJ
#4 UYOIPIQZVT
#5 XISCJOPQPPBZULL
 */

import java.util.Scanner;

public class C03_Andrew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=t; i++){
            String s = sc.nextLine();
            s = s.replaceAll("[ANDEREW]", "");
            System.out.println("#" + i + " " + s);
        }
    }
}

package conditional_statements;

/*
문제
좌표평면에 도형 그리기를 좋아하는 알랩이는 오늘은 직사각형을 그려보기로 하였다.
우선 직사각형을 만들기 위해 세 개의 점을 좌표평면 위에 찍었는데, 장난꾸러기인 지니가 좌표평면을 가지고 도망가서 종이 위에 세 점만 찍혀 있는 것이다!
좌표평면 없이 도형을 그리기가 어려운 알랩이는 한 점을 정확히 어떤 곳에 찍어야 하는지를 알아야 했다! 어려움에 처한 알랩이를 우리가 도와주자.
 */

/*
입력
알랩이가 찍어 놓았던 세 점의 좌표가 한 줄에 하나씩, 각 좌표의 X,Y 축 성분 값들은 공백으로 구분되어 주어진다.
각 좌표의 성분은 1000 이하의 자연수이다.
 */

/*
출력
알랩이가 직사각형을 만들기 위해 찍어야 할 네번째 좌표의 각 성분 값을 공백으로 구분하여 출력한다.
이때, 알랩이가 그리는 직사각형은 모든 변이 좌표평면의 축에 평행한 직사각형을 그린다는 것이 보장된다.
 */

/*
예제 입력
4 4
5 7
5 4
예제 출력
4 7
 */

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[3];
        int[] y = new int[3];
        int[] xCnt = new int[1010];
        int[] yCnt = new int[1010];
        int resultX=0, resultY=0;

        for(int i=0; i<3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            xCnt[x[i]]++;
            yCnt[y[i]]++;
        }

        for(int i=0; i<3; i++) {
            if(xCnt[x[i]] == 1) resultX = x[i];
            if(yCnt[y[i]] == 1) resultY = y[i];
        }

        System.out.println(resultX + " " + resultY);
    }
}

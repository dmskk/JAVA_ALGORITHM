package A02_1다중반복문;

/* 문제
유니는 휴대폰에 있는 사진을 컴퓨터에 옮겨서 확인하고 있다.
휴대폰의 작은 화면에 비해 컴퓨터의 화면이 매우 크기에 모든 기호들이 이에 맞춰 커졌다.
유니가 보고 있었던 그림은 다음과 같고, 크기는 3X3의 행렬처럼 생겼다.

    **X
     X*
    X *

만약 컴퓨터에서 그림이 k배 확대된다고 한다면, 어떻게 출력될지 출력하시오.
k배 확대된다는 뜻은, 휴대폰 화면에서 하나의 문자였던 것이 k X k크기의 같은 문자로 이루어진 행렬로 출력된다는 것이다.
 */

/* 입력
첫째 줄에 20보다 작은 k가 주어진다.
 */

/*
3k의 줄에 걸쳐서 확대된 새로운 그림을 출력한다. 각각의 문자가 k X k의 행렬로 커졌다고 이해하면 좋을 것이다.
 */

/*
예제 입력
4
예제 출력
********XXXX
********XXXX
********XXXX
********XXXX
    XXXX****
    XXXX****
    XXXX****
    XXXX****
XXXX    ****
XXXX    ****
XXXX    ****
XXXX    ****
 */

import java.util.Scanner;

public class D04_ZOOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n*2; j++) {
                System.out.print("*");
            }
            for(int j=0; j<n; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++) {
                System.out.print("X");
            }
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("X");
            }
            for(int j=0; j<n; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

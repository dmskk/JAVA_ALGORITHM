package conditional_statements;

/*
문제
초등학교 교사인 유니는 학생들에게 삼각형이라는 개념을 알려주었다.

삼각형에는 정삼각형, 이등변 삼각형 등의 다양한 종류가 있다.
학생들은 도형 자체를 봤을 땐 무슨 삼각형인지 아나, 각도만 주어졌을 때는 무슨 도형인지를 알지 못한다.

유니는 학생들이 더욱 삼각형에 대해 잘 이해할 수 있도록, 세 각의 크기를 입력하면 무슨 삼각형인지 알려주는 프로그램을 만들어보기로 하였다.

그러나 프로그래밍은 한 번도 해본적이 없는 유니는 이를 어떻게 만들어야 할지 막막하였다. 이런 상황에 놓인 유니를 우리가 도와주도록 하자.
 */

/*
입력
첫째 줄에 삼각형의 각의 크기 3개가 공백으로 구분되어 주어진다. 이때 주어지는 숫자들은 180보다 작은 자연수이다.
 */

/*
출력
세 각의 크기가 모두 60이라면 Equilateral ,
세 각의 합이 180이고 두 각이 같다면 Isosceles ,
세 각의 합이 180이고 같은 각이 없다면 Scalene ,
세 각의 합이 180이 아니라면 Error
을 출력한다.
 */

/*
예제 입력
60
60
60
예제 출력
Equilateral
 */

import java.util.Scanner;

public class figure_discrimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == 60 && b == 60 && c == 60) System.out.println("Equilateral");
        else if(a+b+c == 180 && (a == b || a == c || b == c)) System.out.println("Isosceles");
        else if(a+b+c == 180 && a!=b && a!=c && b!=c) System.out.println("Scalene");
        else if(a+b+c != 180) System.out.println("Error");
    }
}

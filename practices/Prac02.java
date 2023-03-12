/*
Q)  3개의 점수를 입력받고 점수들의 평균값이 
	70점 이상이면 ‘합격’, 아니면 ‘불합격’을 출력하시오.

    ↓ Console ↓
	점수1 입력: 60
	점수2 입력: 70
	점수3 입력: 75
	결과: 불합격

*/
package practices;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("점수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("점수3 입력 : ");
		int num3 = sc.nextInt();

		if ((num1 + num2 + num3) / 3 >= 70)
			System.out.println("결과: 합격");
		else
			System.out.println("결과: 불합격");
	}
}

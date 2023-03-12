/*
Q)  사용자로부터 두 자연수를 입력 받아서 
	두 자연수의 합과 차를 구하여 출력하시오.
    단, 두 수의 차는 결과값이 양수가 나오도록 출력하시오.

    ↓ Console ↓
    자연수1을 입력하세요: 30
	자연수2를 입력하세요: 50
	두 자연수의 합은 80
	두 자연수의 차는 20

*/
package practices;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수1을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("자연수2을 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.println("두 자연수의 합은 " + (num1 + num2));
		System.out.println("두 자연수의 차은 " + (num1 - num2));
	}
}

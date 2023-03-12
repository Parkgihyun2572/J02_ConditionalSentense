/*
Q)  사용자로부터 세 개의 숫자를 입력 받은 후 가장 큰 숫자를 출력하라.

    ↓ 실행화면 ↓
    input num1: 10
    input num2: 9
    input num3: 20
    가장 큰 수: 20
 
*/
package practices;

import java.util.Scanner;

public class Prac06 {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input num1 = ");
		int num1 = sc.nextInt();
		System.out.print("input num2 = ");
		int num2 = sc.nextInt();
		System.out.print("input num3 = ");
		int num3 = sc.nextInt();
		int max = max3(num1, num2, num3);
		System.out.println("가장 큰 수 : " + max);
	}
}

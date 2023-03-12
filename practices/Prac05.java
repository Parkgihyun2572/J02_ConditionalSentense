/*
Q)  사용자로부터 나이, 키를 입력받은 후,
    나이가 40세 이상이고 키가 175이상이면 "키가 큽니다" 를 출력
    175미만이면 "키가 보통입니다."를 출력,

    나이가 40세 미만이고 키가 180이상이면 "키가 큽니다"를 출력
    180미만이면 "키가 보통입니다."를 출력하시오
    
    ↓ Console ↓
	나이를 입력하세요: 42
	키를 입력하세요: 175
	키가 큽니다.
*/
package practices;

import java.util.Scanner;

public class Prac05 {
	static boolean judgeHeight(int age, int height) {
		boolean result = true;
		if (age >= 40) {
			if (height < 175) {
				result = false;
			}
		} else {
			if (height < 180) {
				result = false;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		int height = sc.nextInt();
		boolean result = judgeHeight(age, height);
		if (result == true)
			System.out.println("키가 큽니다.");
		else
			System.out.println("키가 보통입니다.");
	}

}

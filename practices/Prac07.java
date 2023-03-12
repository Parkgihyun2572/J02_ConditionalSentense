/*
Q)  월이 숫자로 입력될때 계절 이름이 출력되도록 해보자.
    단, 월이 아닌 숫자를 입력하면 "에러!" 멘트도 출력되도록 작성해보자.

    예)
    12, 1, 2 : winter
    3, 4, 5 : spring
    6, 7, 8 : summer
    9, 10, 11 : fall
    그외: 에러!
    
    ↓ Console ↓
	월을 입력하세요: 8
	summer
	ㅡ
	↓ Console2 ↓
	월을 입력하세요: 20
	에러!

*/
package practices;

import java.util.Scanner;

public class Prac07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력받아 그 계절을 출력합니다.");
		System.out.print("월을 입력해주세요. : "); int month = sc.nextInt();
		
//		if (month >= 1 && month <= 12) {
//			if (month == 12 || month == 1 || month == 2)
//				System.out.println("winter");
//			else if (month == 3 || month == 4 || month == 5)
//				System.out.println("spring");
//			else if (month == 6 || month == 7 || month == 8)
//				System.out.println("summer");
//			else
//				System.out.println("fall");
//		} else {
//			System.out.println("에러!");
//		}
		
		switch(month) {
			case 12, 1, 2 :
				System.out.println("winter");
				break;
			case 3, 4, 5 :
				System.out.println("spring");
			    break;
			case 6, 7, 8 :
				System.out.println("summer");
			    break;
			case 9, 10, 11 :
				System.out.println("fall");
			    break;
			default :
				System.out.println("에러!");
				
		}
	}

}

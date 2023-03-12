/*
Q)  물건의 가격을 입력 받아 할인율에 따른 할인받는금액을 구하시오.
    5000원 이상은 5%
    10000원 이상은 10%
    50000원 이상은 20%

    ↓ Console1 ↓
	가격 입력: 8000
	할인받는금액: 400
	
	↓ Console2 ↓
	가격 입력: 60000
	할인받는금액: 12000
	
	↓ Console3 ↓
	가격 입력: 3500
	할인받는금액: 0


*/
package practices;

import java.util.Scanner;

public class Prac04 {
	static int salePrice(int price) {
		double sale = 0;

		if (price >= 50000)
			sale = price * 0.2;
		else if (price >= 10000)
			sale = price * 0.1;
		else if (price >= 5000)
			sale = price * 0.05;
		else
			;

		return (int) sale;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		int sale = salePrice(price);
		System.out.println("할인 받는 금액 : " + sale);

	}

}

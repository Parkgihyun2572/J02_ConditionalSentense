/*
# Random 클래스
랜덤한 수를 생성하는 기능을 제공
원하는 범위에서의 난수를 뽑으려면 가공이 필요하다.

	"Random" + ctrl + space
	-> import java.util.Random;
	
	Random 객체이름 = new Random();
	
# 정수 난수 생성
	객체이름.nextInt(개수) + 시작값;

# 실수 난수 생성
	객체이름.nextDouble()*범위 + 시작값;

# true/false 랜덤 생성
	객체이름.nextBoolean();

*/
package contents;

import java.util.Random;

public class API_Random {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println(rd.nextInt());
		
		/* 랜덤 정수 출력 */
		//0~9 랜덤한 정수 출력(0이상 9이하)
		System.out.println(rd.nextInt(10));
		
		//1~10 랜덤한 정수 출력(1이상 10이하)
		System.out.println(rd.nextInt(10) + 1);
		
		//10~20 랜덤한 정수 출력
		System.out.println(rd.nextInt(11) + 10);

		//1~45 랜덤한 정수 출력
		int lotto = rd.nextInt(45) + 1;
		System.out.println(lotto);
		
		//주사위를 던져서 나온 값을 출력하고,
		//해당 값이 6의 약수인지 여부도 확인
		int dice = rd.nextInt(6)+1;
		System.out.println("나온 주사위 눈 : " + dice);
		if (6 % dice == 0) {
			System.out.println("6의 약수 입니다.");
		} else {
			System.out.println("6의 약수가 아닙니다.");
		}
		
		/* 랜덤 실수 출력 */
		//0~1 사이 랜덤한 실수 출력(0이상 1미만)
		System.out.println(rd.nextDouble());
		
		//1~10 사이 랜덤한 실수 출력(1이상 10미만)
		System.out.println(rd.nextDouble()*9 + 1);
		
		//10~15 랜덤한 정수 출력(10이상 15미만)
		System.out.println((int)(rd.nextDouble()*5 + 10));
		
		/* 랜덤 true/false 출력 */
		System.out.println(rd.nextBoolean());
	}
}

/*
# if-else문 
조건식의 결과에 따라서 실행 내용을 선택하여 수행

	if(조건식){
		(if조건식이 참이면 실행)
		실행문1
		실행문2
		...
	}else{
		(if조건식이 거짓이면 실행)
		실행문3
		실행문4
		...
	}

# if - else if - else
조건식이 여러개인 경우 사용. 
else if문은 여러개 사용 가능

	if(조건식A){
		(조건식A가 참이면 실행)
		실행문..
	}
	else if(조건식B){
		(조건식A가 거짓이고 B가 참이면 실행)
		실행문..
	}
	else if(조건식C){
		(조건식A,B가 거짓이고 C가 참이면 실행)
		실행문..
	}
	...
	else{
		(위의 모든 조건식들이 거짓이면 실행)
		실행문..
	}

- else문은 마지막에 한번만 사용 가능
- else문이 있으면 여러 조건문 중 하나는 무조건 시행

*/
package contents;

import java.util.Scanner;

public class C02_Ifelse {
	public static void main(String[] args) {
		/* if-else */
		int num1 = 30;
		if (num1 >= 50) {
			System.out.println("num1이 50보다 크거나 같습니다.");
		} else { // num1 < 50
			System.out.println("num1이 50보다 작습니다.");
		}

		// 어떤 수가 3의 배수인지 아닌지 출력하기
		int num = 30;
		if (num % 3 == 0) {
			// 어떤 수를 3으로 나눈 나머지가 0이면 그 수는 3의 배수
			System.out.println("3의 배수입니다.");
		} else { // num % 3 != 0
			System.out.println("3의 배수가 아닙니다.");
		}

		/* else if문 */
		int num2 = -10;
		if(num2 > 50) {
			System.out.println("50보다 큽니다.");
		}else if(num2==50) {
			System.out.println("50입니다.");
		}else { //num2<50
			System.out.println("50보다 작습니다.");
		}
		
		//어떤 정수가 양수, 0, 음수 중 어디 해당하는지 확인
		int number = 30;
		String res;
		if(number>0) {
			res = "양수";
		}else if(number==0) {
			res = "0";
		}else {
			res = "음수";
		}
		System.out.println(number+"(은)는 "+res+"입니다.");
		
		/* 점수를 입력 받아서 성적 구하기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		System.out.print("성적: ");
		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else { // score<60
			System.out.println('F');
		}
		//코드 자동정렬: ctrl + shif + f
	}
}

/*
중첩 조건문: if문 안에 새로운 if문을 추가
*/
package contents;

import java.util.Scanner;

public class C03_If_if {
	public static void main(String[] args) {
		//중첩조건문 vs 논리연산자
		
		//나이와 키에 따른 탑승 가능한 놀이기구 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력사이오: ");
		int age = sc.nextInt();
		System.out.print("키를 입력사이오: ");
		int height = sc.nextInt();
		
		/* 중첩조건문 사용 */
		if (age >= 14) {
			if (height >= 160) {
				System.out.println("번지점프 가능");
			} else if (height >= 140) {
				System.out.println("롤러코스터 탑승 가능");
			} else {
				System.out.println("후룸라이드 탑승 가능");
			}
		} else {
			System.out.println("회전목마 올라가자");
		}
		
		/* 논리연산자 사용 */
		if(age>=14 && height>=160) {
			System.out.println("번지점프 가능");
		}else if(age>=14 && height>=140) {
			System.out.println("롤러코스터 탑승 가능");
		}else if(age>=14 && height<140) {
			System.out.println("후룸라이드 탑승 가능");
		}else {
			System.out.println("회전목마 올라가자");
		}
	}
}

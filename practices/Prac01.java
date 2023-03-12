/*
Q)  사용자가 신호등의 색깔을 입력하면 R, G, Y 각각에 대하여
    ‘정지!’,‘진행~’,‘주의’와 같은 멘트를 출력하는 프로그램을 만드시오. 
    단, 대소문자 모두 인식하도록 작성하시오.
	
	↓ Console ↓
	신호등의 색깔 입력(R, G, Y): r
	정지!
	
	Tip)
	Scanner sc = new Scanner(System.in);
	System.out.print("신호등의 색깔 입력(R, G, Y): ");
	char sign = sc.next().charAt(0);

*/
package practices;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("신호등의 색깔 입력(R, G, Y): ");
		char sign = sc.next().charAt(0);
		System.out.println(sign);
		
		if(sign == 'R' || sign == 'r') {
			System.out.println("정지!");
		}
		if(sign == 'G' || sign == 'g') {
			System.out.println("진행~");
		}
		if(sign == 'Y' || sign == 'y') {
			System.out.println("주의");
		}
	}	
}

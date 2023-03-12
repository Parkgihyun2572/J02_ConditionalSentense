/*
# switch문
변수가 어떤 값을 갖는지에 따라 case를 선택하여 실행문을 수행

	switch(변수){
	case 값A:
		실행문..
		break;
	case 값B:
		실행문..
		break;
	...
	default:
		실행문..
	}
	
- case의 값은 정수, 단일문자, 문자열만 가능
- switch문은 모두 if문으로도 만들 수 있음
- switch문에서 break는 switch문을 빠져나오는 역할

*/
package contents;

public class C04_Switch {
	public static void main(String[] args) {
		/* switch(정수 변수) */
		System.out.println("1.떡볶이 2.순대 3.튀김");
		int menu = 1;
		System.out.println("메뉴 선택: " + menu);
		
		//if문으로 작성
		if(menu==1) {
			System.out.println("떡볶이를 선택했습니다.");
		}else if(menu==2) {
			System.out.println("순대를 선택했습니다.");
		}else if(menu==3) {
			System.out.println("튀김을 선택했습니다.");
		}else {
			System.out.println("없는 메뉴입니다!");
		}
		
		//switch문 작성
		switch(menu) {
		case 1: //menu==1
			System.out.println("떡볶이를 선택했습니다.");
			break;
		case 2: //menu==2
			System.out.println("순대를 선택했습니다.");
			break;
		case 3: //menu==3
			System.out.println("튀김을 선택했습니다.");
			break;
		default: //menu가 case값들에 해당하지 않으면 실행
			System.out.println("없는 메뉴입니다!");
		}
		
		/* switch(문자 변수) */
		System.out.println("저장하시겠습니까?(y/n)");
		char save = 'N';
		
		switch(save) {
		case 'Y': //break문 없으면 다음 문장 계속 실행
		case 'y': 
			System.out.println("저장되었습니다.");
			break;
		case 'N':
		case 'n':
			System.out.println("저장되지 않았습니다.");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}
		
		/* switch(String 변수) */
		String season = "우주";
		
		System.out.print(season);
		switch(season) {
		case "겨울":
			System.out.println("에는 눈이 옵니다.");
			break;
		case "봄":
			System.out.println("에는 벚꽃이 핍니다.");
			break;
		case "여름":
			System.out.println("에는 장마가 옵니다.");
			break;
		case "가을":
			System.out.println("에는 단풍이 물듭니다.");
			break;
		default:
			System.out.println("은(는) 지구가 아닙니다.");
		}
	}
}

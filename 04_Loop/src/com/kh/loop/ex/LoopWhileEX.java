package com.kh.loop.ex;

import java.util.Scanner;

/*
 
 public static void 이름(){
 
 }
 
 public 어디서든 접근 가능한 : 전체공개
 protected 같은 폴더 안에서만
 default  같은 폴더안에서, protected보다 제한
 private 한 class안에서만 접근가능, 작성한공간안에서만 접근가능
 
 void 반환하는 것 없이 바로 출력이될 때 사용
 
 */
public class LoopWhileEX {

	/*
	 public static void method1(){
	 Scanner sc = new Scanner(System.in);
	 1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료
	 int menu
	 
	 while(true){
	 	sysout("~프로그램작성");
	 	sysout("원하는 프로그램 번호 : ");
		 switch(menu){
		 	case 1:
		 	
		 	case 4:
		 }
	 
	 }
	 while 문을 사용해서 4번을 누르면 프로그램을 종료하는 코드	 
	 	 
	 	 */
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("활동번호를 입력하세요 : ");
			System.out.println("1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
			
			int menu = sc.nextInt();
			
			String activity;
			switch(menu) {
			case 1:
				activity = "1. 게임하기";
				break;
			case 2:
				activity = "2. 수영하기";
				break;
			case 3:
				activity = "3. 잠자기";
				break;
			case 4:
				//activity = "4. 프로그램 종료"; 넣기?
				System.out.println("4. 프로그램 종료");
				return;
				default:
					System.out.println("잘못된 입력입니다.");
					return;
				
			}
			System.out.println("선택한 활동은 " + activity + " 입니다.");
			
		}
		
		
		
	}
	
public static void method1_1() {//잘못된번호입력시 다시입력받도록하기.
		
		Scanner sc = new Scanner(System.in);
		while(true) { //while(menu != 4)해보기?//1_2로.
			System.out.print("활동번호를 입력하세요 : ");
			System.out.println("1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
			
			int menu = sc.nextInt();
			
			String activity;
			switch(menu) {
			case 1:
				activity = "1. 게임하기";
				break;
			case 2:
				activity = "2. 수영하기";
				break;
			case 3:
				activity = "3. 잠자기";
				break;
			case 4:
				//activity = "4. 프로그램 종료"; 넣기?
				System.out.println("4. 프로그램 종료");
				return;
				
				default:
					System.out.println("잘못된 입력입니다.다시입력해주세요.");
					activity ="error";
					//break; //안해도빠져나감.
				
			}
			if( !activity.equals("error") )
				System.out.println("선택한 활동은 " + activity + " 입니다.");
			
		}
		
		
		
	}

public static void method1_2() {//잘못된번호입력시 다시입력받도록하기.menu!=4버전-별로인듯.
	//menu 0 초기화해놓고 menu가 종료인4로 나중에 설정된다고해도switch에서 case4들어가게됨.
	//만약 case4구현안하고 default로 처리한다고치면 (종료4와 번호오류)를 구분못하게됨.
	//따라서 case4구현해야하고 그러면 menu != 4비교가 의미크게없을듯.
	
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	while(menu != 4) { //while(menu != 4)해보기
		System.out.print("활동번호를 입력하세요 : ");
		System.out.println("1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
		
		menu = sc.nextInt();
		
		String activity;
		switch(menu) {
		case 1:
			activity = "1. 게임하기";
			break;
		case 2:
			activity = "2. 수영하기";
			break;
		case 3:
			activity = "3. 잠자기";
			break;
		case 4:
			//activity = "4. 프로그램 종료"; 넣기?
			System.out.println("4. 프로그램 종료");
			return;
			
			default:
				System.out.println("잘못된 입력입니다.다시입력해주세요.");
				activity ="error";
				//break; //안해도빠져나감.
			
		}
		if( !activity.equals("error") )
			System.out.println("선택한 활동은 " + activity + " 입니다.");
		
	}
	
	
	
}

	public static void cafe_kh() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("kh카페에 오신 걸 환영합니다.\n"
				+ "원하는 메뉴를 입력해주세요.\n"
				+ "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5 주문취소");
		
		String menu = sc.next();
		
		switch(menu) {
		case "1": case "아메리카노":
			System.out.println("1.아메리카노 주문 추가되었습니다.");
			break;
			
		case "2": case "카페라떼":
			System.out.println("2. 카페라떼 주문 추가되었습니다.");
			break;
			
		case "3": case "녹차":
			System.out.println("3. 녹차 주문 추가되었습니다.");
			break;
			
		case "4": case "흑당버블티":
			System.out.println("4. 흑당버블티 주문 추가되었습니다.");
			break;
			
		case "5": case "주문취소":
			System.out.println("5.주문이 취소 되었습니다.");
			return;
			
			default:
				System.out.println("번호를 잘못 입력했습니다. 다시입력해주세요.");
		}
		}
		
	}
	
	public static void getMoney() {
		//커피값 10잔, 커피값 300원
		int coffee = 10;
		int money = 300;
		
		// 만약에 가진돈이 0보다 많다면 커피를 구매하고
		//커피가 소진되면 판매중지
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔 제공했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + " 잔 입니다.");
			
			//커피 소진
			if(coffee == 0) {
				System.out.println("커피가 소진되었습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	// 1부터 5까지 숫자를 출력
	public static void allNumber() {
		int num = 1;
		while(num <= 5) {// 여기서 int num <= 5 또는 int i <=5 하면오류?-num이안정해짐
			System.out.println(num);
			num++; // num = num + 1;
			
		}
		
	}
	
	//10번찍어서 안넘어가는 나무 없습니다.
	//나무를 10번찍으면 나무 넘기기
	public static void tree() {
		//나무를 찍기 전이기 때문에 공격 0
		int hit = 0;
		
		while(hit < 10) {
			//나무를 몇 번 찍었는지 확인
			hit ++;//while첫실행시 hit == 1, 10번실행시 hit==10, 11번째는실행x
			System.out.println("나무를 " + hit + " 번 찍었습니다.");
			
			//만약에 10번 공격하면 나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다. 성공.");
			}
		}
	}
	
	/*
	 사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
	 단 입력한 수가 1보다 크거나 같아야 함
	 만약에 1 미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주세요 출력하기
	 
	 
	 */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			System.out.println("1부터 " + num + " 까지의 숫자들");
			int abc = 1;
			//while문을 사용해서 숫자 abc부터 num까지 모두 출력하기
			while(abc <= num) {
				System.out.println(abc);
				abc++;
			}
			
		}
		
		
	}
	
	//커피가100원 돈이없으면 커피 구매못함.
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		//커피가격 coffeePrice
		int coffeePrice = 100;
		
		System.out.println("카페에 오신 걸 환영합니다.");
		System.out.print("현재 가진 금액을 입력해 주세요 : ");
		
		//현재 가지고 있는 금액 입력
		int money = sc.nextInt();
		
		//만약에
		while(money < coffeePrice) {
			/*
			 돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요.
			 현재 가진 돈을 입력해주세요.
			 현재 가진 돈 입력
			 nextInt();
			 */
			System.out.print("돈이 부족합니다. 가진돈을 다시 입력해주세요 : ");
			money = sc.nextInt();
		}
		//커피를 구매했다면 구매했습니다. 거스름돈 입력하기
		System.out.println("커피를 구매했습니다.");
		money -= coffeePrice;
		System.out.println("남은돈 : " + money);
		
		
	}
	
	//10000원이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
	public static void iLovePork() {
		//1. Scanner를 이용해서 현재 보유하고 있는 금액 입력하기
		int tangsuyuk = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.print("보유금액 입력 : ");
		int myMoney = sc.nextInt();
		
		// 보유하고 있는 금액이 tangsuyuk 보다 적으면 잔액이 부족합니다.
		//다시 입금해주세요.
		//nextInt 다시 입금할 금액 받기
		while(myMoney < tangsuyuk) {
			System.out.print("잔액이 부족합니다. 다시 입금해주세요 : ");
			myMoney = sc.nextInt();
		}
		System.out.println("주문이 완료되었습니다.");
		System.out.println("현재 잔액은 " + ( myMoney - tangsuyuk ) + " 입니다.");
		//돈이 10000원 이상이면 주문이완료되었습니다.
		//현재 잔액은 _입니다.
		
	}
		
		
	
	
	public static void main(String[] args) {

		//method1();
		method1_1();
		
		//method1_2();
		
		//cafe_kh();
		//getMoney();
		//allNumber();
		//tree();
		
		//method2();
		
		//getCoffee();
		//iLovePork();
		
	}

}

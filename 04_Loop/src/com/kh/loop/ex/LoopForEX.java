package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	//기본 메서드
	
	/*
	 
	 LoopForEX에서 출력하길 원한다면
	 public static void guguDan으로 static 추가해주고 main에 guguDan();넣기
	 
	 static 안붙이고 출력하길 원한다면
	 출력용 클래스 만들어서 출력하기 LoopForRun 클래스
	 
	 
	 */
	
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		// 구구단 0 입력하기 전까지 반복출력하기 추가.
		//반복위해 while문 사용
		while(true) {
			
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해주세요 : ");
			
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("종료됨.");
				break;
			}
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		
		}
	}
	
	public void guguDan2() {
		//1. 스캐너로 구구단 단 입력받기
		//2. int dan = sc.nextInt();
		//3. for문을 활용해서 9~1번까지출력
		//for(int a = 1; 조건 ; a--)
		
		//4. 종료를 원할 경우 0을 입력해주면 종료하기 위한 while문추가.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("거꾸로 볼 단 입력 : ");
			int dan = sc.nextInt();
			
			if(dan == 0) {
				System.out.println("종료됨.");
				break;//for while switch에서 사용가능
			}
			
			//continue 자주사용되지않음
			//if 1~9까지만 입력 가능하도록 추가
			if(dan < 1 || dan > 9) {
				System.out.println("1부터 9까지만 입력해주세요");
				continue;//조건맞으면 위로가서 다시시작(계속하기)
			}
			
			for( int a = 9; a >= 1; a-- ) {
				System.out.println(dan + " * " + a + " = " + dan*a);
			}
		
		
		}
		
		
	}
	
	public void guguDan3() {
		//int dan = 원하는 단
		
		//1~9단출력
		for(int dan = 1; dan <= 9; dan++) {
			
			//1단에서부터 1~9를 곱해준 값 출력
			for(int num = 1; num <= 9; num++) {
				
			}
			
		}
	}
	
	public void gugudan4() {
		
		
	}
	
	public void randomNumber() {
		
		//Random 불러와 내가 지정한 범위에서 랜덤출력
		Random ran = new Random();
		
		//범위지정가능
		int ranNum = ran.nextInt(10) + 1;// +1 안하면 0~9
		System.out.println("randaom숫자 : " +  ranNum);
		
	}
	public void randomFor() {
		Random ran = new Random();
		
		for(int num = 1; num <= 3; num++) {
			int ranNum = ran.nextInt(10) + 1; //1~10
			System.out.println("ranNum : " + ranNum);
		}
	}
	
	public void randomFor2() {
		//랜덤으로 1~45번 6자리 for문으로 출력
		Random ran = new Random();
		
		for( int num = 0; num < 6; num++ ) {
			int ranNum = ran.nextInt(45) + 1;
			
			//if 랜덤 숫자가 같다면 번호 제외하고 출력 가능한데 지금은 같을수있음.
			System.out.print(num+1 + "번:" + ranNum + " ");
		}
	}
	
	// 1부터 10까지의 숫자 중에서 홀수만 출력하기
	//홀수 = odd
	public void oddNum() {
		int num = 10;
		for( int i = 1; i <= num; i++ ) {
			if(i%2 == 1) {// i % 2 != 0
				System.out.print(i + " ");
			}
		}
	}
	
	// 짝수만 1~10까지
	//짝수 = even
	public void evenNum() {
		int num = 10;
		for(int i = 1; i <= num; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void squareStar() {
		int n = 3;
		for(int i = 0; i < n; i++ ) {
			
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	//정사각형 모향의 별 출력을 가로로 5개씩
	public void fiveStar() {
		int star = 5;
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	public void numberGame() {
		//숫자맞추기게임
		//숫자맞출때까지문제풀도록하기.
		//for기회 2번
		//if문 수정해서 숫자값이 정답보다 작으면 숫자가작습니다.
		//크면 숫자가너무큽니다.
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
		
		Random random = new Random();
		int randomNum = random.nextInt(3) + 1; //1~3
		System.out.println("숫자를 맞혀보세요.");
		
		int guest = sc.nextInt();
		
		if(guest == randomNum) {
			System.out.println("축하합니다.");
			break;
		}
		else {
			System.out.println("틀렸습니다.");
			System.out.println("정답은 " + randomNum + " 입니다.");
		}
		}
		
		
		
	}
	
	
	
	
	//이파일에클래스안에 메인넣어도 guguDan이 static 메서드아니라서 lfe생성했음.
	/*
	public static void main(String[] args) {
		
		LoopForEX lfe = new LoopForEX();
		lfe.guguDan();
		
	}
	*/

}
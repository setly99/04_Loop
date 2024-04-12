package com.kh.loop.ex;

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
	
	//이파일에클래스안에 메인넣어도 guguDan이 static 메서드아니라서 lfe생성했음.
	public static void main(String[] args) {
		
		LoopForEX lfe = new LoopForEX();
		lfe.guguDan();
		
	}

}
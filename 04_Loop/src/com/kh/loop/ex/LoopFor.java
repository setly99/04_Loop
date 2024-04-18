package com.kh.loop.ex;

public class LoopFor {
	/*
	 for문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문
	 특정 조건을 만족하는 동안 { } 코드 블록을 반복해서 실행
	 반복 횟수가 일정하게 정해진 경우 많이 사용
	 
	 사용 예제
	 for ( 초기식 ; 조건식 ; 증감식 ){
	 
	 	//조건이 맞을 경우 반복해서 실행될 코드 블록
	 }
	 
	 //for문에서 조건이 맞지 않으면 탈출
	 
	 for - each 문
	 배열이나 반복 가능한 모든 값에 대해 반복적으로 작업할 때 사용하는 편리한 반복문
	 조건이 반복이 처음부터 끝까지 모두 반복
	 
	 사용 예제
	 for(자료형 변수명 생성 : 반복해서 보여주고자 하는 변수명) {
	 	//실행하고자하는 작업작성
	 	 sysout(생성된변수명작성);
	 }
	  
	 */
	

	public static void main(String[] args) {

		
		
		for(int i = 1 ; i <= 2; i++) {
			//위에 선언했어도
			//초기식을 i;로만 하면 안됨. 초기식을i++;로하면됨(i=i+1;)
			//즉, 초기식에는 i에 값 지정이필요
			
			//+보통 for문안에 int i = 1;로 선언까지함.
			System.out.println(i);
		}
		
		System.out.println("===== for문 2번 =====");
		for(int a = 1; a <= 3; a ++) {
			System.out.println("a의값 :" + a);
		}
		
		System.out.println("===== for문 3번 =====");
		//int값을 num = 1로 주고 num의 값이1부터5까지 나오도록
		for(int num = 1; num  <= 5; num++) {
			System.out.println("num:" + num);
		}
		
		System.out.println("===== for문 4번 =====");
		// 1부터 10까지 짝수만 출력해보기
		//int num = 2; 증감식에서 num += 2;
		for(int num = 2; num <= 10; num+=2) {
			System.out.println("num:" + num);
		}
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		// for문 구구단 5단 출력하기
		//단의 값이 5임을 표시
		int dan = 5;
		for( int i = 1; i <= 9; i++ ) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			
		}
		
		//실습문제 6번
		System.out.println("===== for 6번 =====");
		//구구단에서 3단을 출력하기
		//3 * 1 = 3
		//3 * 9 = 27
		//int dan3 = 3;
		//int num = 1;
		int dan3 = 3;
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan3 + " * " + num + " = " + dan3*num);
			
		}
		
		
	}

}

package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	 do-while : do에서 while 조건에 상관없이 무조건 한 번은 실행
	 	조건이 false여도 최초1회는 무조건실행
	 사용예제
	 do{
	 	수행될 문장;
	 }while(조건식){
	 
	 }
	 
	 */
	public static void main(String[] args) {
		int count = 1;
		do {
			System.out.println("숫자값 : " + count);
			count++;
			
		}while(count <= 5);
	}

}

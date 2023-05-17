package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	public static void main(String[] args) {
		
		/*
		 *  삼항 연산자
		 *  
		 *  [표현법] 조건식 ? 식1: 식2;
		 * 
		 * 
		 * - 조건식에는 주로 비교, 논리 연산자가 사용된다
		 * - 조건식의 결과가 true 이면 식1을 수행한다
		 * - 조건식의 결과가 false 이면 식2를 수행한다.
		 *  
		 * 
		 * 
		 */
		
		
		F_Triple f = new F_Triple();
		//f.method1();
		//f.pratice1();
		f.pratice2();
	}
	public void method1() {
		int number = 0 ;
		int a=0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 >");
		
		number = sc.nextInt();
		
		
		//입력받은 정수가 양수인지 음수인지 판단
		
		
		//result = (number >=1) ? "양수이다" : "음수이다";
		
		
		
		//양수이다 음수이다 0이다
		
		
		
		result = (number >0) ? "양수이다" : (number <0) ? "음수이다": "0이다";
		
		
		System.out.println(result);
		
	
		/*if(a==number) {
			
			System.out.println("0이다");
		}
		
		else if(number>0)
		{
			System.out.println("양수이다");
			
		}
		else {
			
			System.out.println("음수이다");

			
		}
		*/
		
		
		
		
		
		
		
		
	}
	/*
	 * 문제1
	 * 
	 * 사용자한테 두개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 " 결과가 100 이상입니다"
	 * 아닌경우 "결과가 100보다 작습니다" 출력
	 * 
	 * [표현법] 조건식 ? 식1: 식2;
	 */
	public void pratice1() {
		
		
		Scanner sc1 = new Scanner(System.in);
		int a,b =0;
		System.out.println("두개의 정수값을 입력하세요 : ");
		
		a = sc1.nextInt();
		b = sc1.nextInt();
		
		int c= a*b;
		String d = "";
		
		d = (c>=100) ? "결과값이 100이상입니다." : "결과값이 100보다 작습니다.";
		
		System.out.println(d);
		
		
		
		
	}
	/* 문제2
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다" 아닌경우 "알파뱃 대문자가 아니다."출력
	 * 
	 * 
	 * 
	 */
	public void pratice2() {
		
		Scanner sc = new Scanner(System.in);
		String b = "";
		char a = 0;
		System.out.print("문자를 하나 입력해주세요 : ");
		
		a = sc.nextLine().charAt(0);
		
		b = (a>=65&&a<=90) ? "알파벳 대문자이다" : "알파뱃 소문자이다";
		
		
		System.out.println(b);
			
		
		
	}
	
	
}

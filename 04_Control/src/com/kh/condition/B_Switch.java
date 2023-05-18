package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
	/*
	 * switch 문
	 * 
	 * [표현법]
	 * 
	 * switch(조건문){
	 * 	case 값1: 
	 * 		..조건식의 결과가 값1과 같을 경우 실행..
	 * 		break;
	 * 	case 값2: 
	 * 		..조건식의 결과가 값2과 같을 경우 실행..
	 * 		break;
	 * default:
	 * 	조건식의 결과가 일치하는 case문이 없을 때 실행 코드
	 * 
	 * }
	 * 
	 * - case문의 수는 제한이 없다
	 * - 조건식 결과는 정수,문자,문자열이어야 한다.
	 * - 조건문을 빠져나오려면 break가 필요하다.
	 * - default문은 생략 가능하다.
	 *  
	 */
	
	public void method1() {
		/* 숫자를 입력받아
		 * 1일경우 빨간색
		 * 2일경우 파란색
		 * 3일경우 초록색
		 * 이외의 숫자 잘못입력하셨습니다.
		 * 
		 * 
		 */
		int a = 0;
		System.out.print("정수 입력");
		
		a = sc.nextInt();
		
//		if (a ==1)System.out.println("빨간색");
//		else if (a ==2)System.out.println("파란색");
//		else if (a ==3)System.out.println("초록색");
//		else System.out.println("잘못 입력하셨습니다.");
//		
		
		switch(a)
		{
			case 1:	
				System.out.println("빨간색"); 
				break;
			case 2: 
				System.out.println("파란색");
				break;
			case 3:	
				System.out.println("초록색"); 
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			
		}
	
	}
	/* 등급별 권환
	 * 1 : 관리권한 글쓰기권한 읽기권한
	 * 2 : 글쓰기권환 읽기권환
	 * 3 : 일기권환
	 * 
	 * 
	 * 
	 */
	public void practice1() {
		
		String a = "관리권환";
		String b = "글쓰기권환";
		String c = "읽기권환";
		
		int d = 0;
	
		System.out.print("권환 등급 입력 :");
		
		d = sc.nextInt();
		
//		switch(d) {
//			
//			case 1:
//				System.out.println(a+"\n"+b+"\n"+c);
//				break;
//			case 2:
//				System.out.println(b+"\n"+c);
//				break;
//			case 3:
//				System.out.println(c);
//				break;
//		
//		}
		switch(d) {
			case 1 : System.out.println(a);
			case 2 : System.out.println(b);
			case 3 : System.out.println(c);
		
		}
		
		
	}
	public void practice2() {
		
		/*
		 *월을 입력했을 때 계쩔을 출력
		 * 
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12 , 1 ,2 : 겨울
		 * 
		 * 월>5
		 * 봄
		 * 
		 */
		
		int a = 0 ;
		System.out.print("월 입력 >");
		
		a = sc.nextInt();
	
		switch(a){
			case 3: case 4:	case 5: 
				System.out.println("봄");break;
			case 6: case 7: case 8: 
				System.out.println("여름");break;
			case 9: case 10: case 11: 
				System.out.println("가을");break;
//			case 12: case 1: case 2: 
//				System.out.println("겨울");break;
			default:
				System.out.println("겨울");		
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		B_Switch b = new B_Switch();
		//b.method1();
		//b.practice1();
		b.practice2();
		
	}

}

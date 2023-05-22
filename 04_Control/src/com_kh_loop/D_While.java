package com_kh_loop;

import java.util.Scanner;

public class D_While {
	Scanner sc = new Scanner(System.in);

	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식){ ..실행 코드.. }
	 * 
	 * 
	 */
	public void method1() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println();

		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;

		}

	}

	/*
	 * break문 -switch, 반복문의 실행을 중지하고 빠져나갈 때 사용 -반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만
	 * 빠져나간다.
	 * 
	 */
	// for 문 무한루프 = 무한반복
	public void method2() {

		for (int i = 1;;) {
			if (i <= 5) {
				System.out.println(i);
			} else {
				break;
			}
			i++;
		}

		int i = 1;
		for (;;) {
			if (i <= 5) {
				System.out.println(i);
			} else {
				break;
			}
			i++;
		}

	}

	public void method3() {
		int input =0;
			while(true) {
				System.out.print("숫자입력>");
				input = sc.nextInt();
				System.out.println(input);
				
			}

	}
	/* do - while 문
	 * 
	 * [표현법]
	 * do {
	 * 
	 * } while(조건식);
	 */
	public void method4() {
		int number =1;
		while(number ==0){
			System.out.println("while문");
		}
		do {
			System.out.println("d0-while문");
		}while(number==0);
	}
	// 반복문 + 조건문
	/*
	 * 숫자 맞히기 게임
	 * 1과 100사이의 값을 입력해서 임의로 지정한 값을 맞히면 게임끝
	 * 게임이 끝나면 몇번만에 숫자를 맞혔는지 출력
	 * 1과 100사이의 값 입력 >35
	 * 더 큰 수를 입력하세요
	 * 1과 100사이의 값 입력 >70
	 * 더 작은 수를 입력하세요
	 * 
	 * 1과 100사이의 값 입력 >57
	 * 3번만에 맞췄습니다.
	 * 
	 * 
	 */
	public void method5() {
		int a,b=0;
		int random = (int) (Math.random()*100)+1;
		while(true) {
			System.out.println("1과 100사이의 값을 입력 > ");
			a = sc.nextInt();
			b++;
			if (a==random) {
				System.out.println(b+"번만에 정답입니다");

				break;
			}else if(a<random) {
				System.out.println("더 큰 수를 입력해주세요");
				
			}
			else 
				System.out.println("더 작은 수를 입력해주세요");
				
			}
		}
	
	/*
	 *  1. 예금 2.출금 3.잔고 4.종료
	 *  
	 *  선택 > 1 
	 *  예금액 > 5000
	 *  -------------------------------
	 *  1. 예금 2.출금 3.잔고 4.종료
	 * 	
	 * 선택 > 2
	 * 출금액 > 2000
	 * ------------------------
	 * 
	 * 1. 예금 2.출금 3.잔고 4.종료
	 * 
	 * 선택 3> 
	 * 
	 * 잔고> 3000
	 * 
	 * ----------------------------------
	 * 
	 * 선택>4 
	 * 
	 * 프로그램 종료
	 * 
	 */
	
	public void method6() {
		int a=0;
		int a1=0;
		int b1=0;
		int c1=0;
		boolean a2 = true;
		//Integer.paresInt : Integer 클래스의 parseInt 메소드
		// String -> int 
		
		while(a2) {
			System.out.println("1. 예금 2.출금 3.잔고 4.종료");
			a = Integer.parseInt(sc.nextLine());
//			if (a==1) {
//				System.out.println("얼마를 입금 하시나요 ? :");
//				a1 = sc.nextInt();
//			}
//			else if(a==2) {
//				System.out.println("얼마를 출금 하시나요 ? :");
//				b1 = sc.nextInt();
//			}
//			else if(a==3) {
//				System.out.println("출금하실 금액은 : "+(a1-b1)+"원");
//			}
//			else if(a==4) {
//				System.out.println("시스템을 종료합니다");break;	
//			}
//					
			
			switch(a) {
			case 1:
				System.out.println("얼마를 입금 하시나요 ? :");
				a1 += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("얼마를 출금 하시나요 ? :");
				a1 -= Integer.parseInt(sc.nextLine());
				break;
			case 3:	
				System.out.println("출금하실 금액은 : "+a1+"원");
				break;
			case 4:
				a2 = false;
				System.out.println("시스템을 종료합니다");
				
			}
			
			
			
			}

			
			
		}
		
		
		
		
		
		

		
	

	public static void main(String[] args) {

		D_While d = new D_While();
//		d.method1();
//	    d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
		d.method6();

	}

}

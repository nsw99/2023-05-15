package com.kh.condition;

import java.util.Scanner;

public class A_If {

	Scanner sc = new Scanner(System.in); // 인스턴스 변수

	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { 조건식이 참(true)일 때 실행하는 코드 }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용한다
	 */
	public void method1() {
		int score = 60; // 지역 변수

		// 60 점 이상이어야 합격 !
		if (score >= 60) {
			System.out.println("합격 !");

		}

// if(score>=60) System.out.println("합격!");

		else {
			System.out.println("불합격");
		}

	}

	/*
	 * if - else 문
	 * 
	 * 
	 * [표현법]
	 * 
	 * if (조건식){ 조건식이 true일 경우 }
	 * 
	 * else{ 조건식이 false 일 경우 }
	 * 
	 * 
	 */

	public void method2() {
		int score = 0;
		String a = "";
		System.out.print("점수를 입력해주세요 : ");

		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격입니다!");

		}

		else {
			System.out.println("불합격입니다");
		}

		// 삼항 연산자
		// System.out.println((score >= 60)> "합격" : "불합격")
		a = (score >= 60) ? "합격입니다" : "불합격";
		System.out.println(a);
	}

	public void method3() {

		String name = "";

		System.out.print("이름을 입력해주세요 : ");

		name = sc.nextLine();

		System.out.println("노석우" == name);// false 주소값은 == 사용불가
		System.out.println("노석우".charAt(0));// String 클래스에 charAt(0)의 메소드

		if ("노석우".equals(name))// String 클래스의 equals() 메소드
		{
			System.out.println("본인입니다");

		} else {
			System.out.println("본인이 아닙니다.");

		}

	}

	public void method4() {

		int number = 0;

		System.out.print("숫자 입력 : ");

		number = sc.nextInt();

		// 0보다크면 양수 아니면 음수?
		// 중첩 if문 : if문 중첩해서 사용 가능

		if (number > 0) {
			System.out.println("양수");
		} else {

			if (number == 0) {
				System.out.println("0입니다");
			}

		}
	}

	/*
	 * if - else if- else 문
	 * 
	 * [표현법]
	 * 
	 * if (조건식1){ 조건식1이 참(true)일 때 실행할 코드 } else if (조건식2){ 조건식2가 참(true)일 때 실행할 코드
	 * }
	 * 
	 * else{ 위에 조건식이 만족하지 않을 때 실행하는 코드 }
	 * 
	 * - else if 수는 제한이 없다 - else는 생략이 가능하다.
	 */
	public void method5() {

		int number = 0;

		System.out.print("정수를 입력해주세요 : ");

		number = sc.nextInt();

		if (number > 0) {
			System.out.println("양수입니다");
		}

		else if (number < 0) {
			System.out.println("음수입니다");
		}

		else
			System.out.println("0입니다");

	}

	/*
	 * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라 - 90 점 이상은 A등급 - 90점 미만 80점이상은 b등급 - 80점
	 * 미만 70점이상은 c등급 - 70점 미만 60점이상은 d등급 -60점 미만 f등급
	 * 
	 * 
	 */
	public void method6() {

		int a = 0;
		System.out.print("점수를 입력해주세요 :");
		a = sc.nextInt();

		/*
		 * if (a>=90){ System.out.println("A등급입니다"); }
		 * 
		 * else if (a>=80&&a<90){ System.out.println("b등급입니다"); }
		 * 
		 * else if (a>=70&&a<80){ System.out.println("c등급입니다"); }
		 * 
		 * else if (a>=60&&a<70){ System.out.println("d등급입니다"); } else {
		 * System.out.println("f등급입니다"); }
		 */

		char grade = '\u0000';

		if (a < 60) {
			grade = 'f';
		}

		else if (a < 70) {
			grade = 'd';
		}

		else if (a < 80) {
			grade = 'c';
		}

		else if (a < 90) {
			grade = 'b';
		} else {
			grade = 'a';
		}
		System.out.println(grade);

	}

	/*
	 * 세 정수를 입력했을 때 짝수만 출력
	 * 
	 * num1 입력 >3 num2 입력 >4 num3 입력 >6
	 */
	public void pratice() {
		int a, b, c = 0;

		System.out.print("3개의 정수를 입력해주세요");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		/*
		 * if (a%2==0 && b%2==0 && c%2==0) System.out.printf("%d %d %d",a,b,c); else if
		 * (a%2!=0 && b%2==0 && c%2==0)System.out.println(b+" "+c); else if (a%2==0 &&
		 * b%2!=0 && c%2==0)System.out.println(a+" "+c); else if (a%2==0 && b%2==0 &&
		 * c%2!=0)System.out.println(b+" "+a); else if (a%2==0 && b%2!=0 &&
		 * c%2!=0)System.out.println(a); else if (a%2!=0 && b%2!=0 &&
		 * c%2==0)System.out.println(c); else if (a%2!=0 && b%2==0 &&
		 * c%2!=0)System.out.println(b); else System.out.println("홀수"); 나는 병신입니다 ㅋㅋ 이렇게
		 * 코드를 짜네 ㅋㅋ
		 */
		if (a % 2 == 0)
			System.out.println(a);
		if (b % 2 == 0)
			System.out.println(b);
		if (c % 2 == 0)
			System.out.println(c);

	}

	/*
	 * 정수 1개를 입력했을 때 마이너스/양수/0, 짝수(even)/홀(odd)출력
	 */
	public void pratice2() {

		int a = 0;
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		String s = "even";
		String c = "odd";
		if (a % 2 == 0 && a > 0)
			System.out.println("양수\n" + s);
		else if (a % 2 != 0 && a > 0)
			System.out.println("양수\n" + c);
		else if (a % 2 == 0 && a < 0)
			System.out.println("음수\n" + s);
		else if (a % 2 != 0 && a < 0)
			System.out.println("음수\n" + c);
		else if (a == 0)
			System.out.println("0임");
	}
		

		/*
		if (a > 0) {
			System.out.println("plus");

			if (a % 2 == 0) {
				System.out.println(s);
			} else
				System.out.println(c);
		}

		else if (a < 0) {
			System.out.println("minus");
			if (a % 2 == 0) {
				System.out.println(s);

			} else
				System.out.println(c);
		} else
			System.out.println("zero");

	}
*/

	public static void main(String[] args) {
		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.pratice();
		a.pratice2();
	}
}

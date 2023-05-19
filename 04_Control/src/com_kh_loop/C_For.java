package com_kh_loop;

import java.util.Scanner;
import java.lang.Math;

public class C_For {

	Scanner sc = new Scanner(System.in);

	/*
	 * for 문 [표기법]
	 * 
	 * for (초기식; 조건식; 증강식) { ...실행 코드... }
	 * 
	 * - 주어진 횟수 만큼 코드를 반복 실행하는 구문 - 초기식은 반복문이 수행될 떄 단 한번만 실행되는 구문으로 반복문 안에서 사용하게 될
	 * 변수를 선언하고 초기값을 대입한다. - 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문(for)를 빠져나간다. - 증강식은
	 * 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 */
	public void method1() {

		for (int i = 0; i < 5; i++) {
			System.out.println(i + 1);
		}

	}

	public void method2() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

	}

	public void method3() {
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
	}

	/*
	 * continue 문
	 * 
	 * -continue 문은 반복문 안에서 사용 - 반목문 안에서 continue문을 만나게 되면 " 현재 구문"을 종료 - 반복문을 벗어나는
	 * 건 아님 ! 다음 반복문을 계속 수행
	 * 
	 */

	// 1 ~ 10 사이의 짝수만 출력

	public void method4() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;

			System.out.println(i);

		}
	}

	// 1~10까지의 합계
	public void method5() {
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			System.out.println("1부터" + i + "까지의 합계 :" + sum2);

		}
		System.out.println(sum2);

	}

	// 1부터 사용자가 입력한 수 까지의 합계
	public void method6() {

		int a, b = 0;
		System.out.print("숫자를 입력하면 1부터 입력하신 숫자까지 더해줍니다 : ");
		a = sc.nextInt();

		for (int i = 0; i <= a; i++) {
			b += i;

		}

		System.out.println("합계 : " + b);

	}

	// 1 부터 랜덤값까지의 합계
	/*
	 * java.lang.math 클래스에서 제공하는 random() 메소드 호출해서 매번 다른 랜덤값을 얻어 낼 수있음
	 */
	public void method7() {

		double random = Math.random() * 10; // 범위 : 0.0<= random< 1.0
		int a = (int) random;
		int sum = 0;
		// random = Math.random() * 10 // 범위 : 0.0<=random<10.0
		// random = Math.random() * 10 +1 // 범위 : 1.0<=random<11.0
		// int num = (int) random;
		// System.out.println(num);
		for (int i = 1; i < random; i++) {
			sum += i;

		}
		System.out.println(sum);
	}

	/*
	 * h e l l o
	 */

	public void method8() {

//		String s = "";
//		int b = 0;
//		System.out.println("문자를 입력해주세요 : ");
//		s =sc.nextLine();
//		
//		b = s.length();
//		
//				
//		for(int i =0; i<b; i++)
//		{
//				
//			System.out.println(s.charAt(i));
//		}
//		
//		

		String s = "";
		System.out.println("문자를 입력해주세요 : ");
		s = sc.nextLine();

		for (int i = 0; i < 5; i++) {

			if (s.equals(""))
				continue;
			System.out.println(s.charAt(i));
		}

	}

	// 사용자한테 입력받은 문자열 출력
	public void method9() {
		String s = "";
		int a = 0;
		System.out.println("문자를 입력해주세요");
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));

		}
	}

	// 구구단 2단 출력
	public void method10() {
		int a = 0;
		System.out.println("원하는 구구단을 입력해주세요 : ");
		a = sc.nextInt();

		System.out.println(a + "단->");

		for (int i = 1; i < 10; i++) {
			System.out.println(a + "x" + i + ":" + a * i);
		}

	}

	public void method11() {

		int a = 0;
		System.out.println("원하는 구구단을 입력해주세요 : ");
		a = sc.nextInt();

		System.out.println(a + "단->");

		for (int i = 1; i < 10; i++) {
			if (a < 10)
				System.out.println(a + "x" + i + ":" + a * i);
		}
		if (a > 10)
			System.out.println("잘못 입력하셨습니다.");

	}
	
	//2단부터 9단까지 전부다 출력
	public void method12() {
		
		int a ,b= 0;
		System.out.println("숫자입력");
		a= sc.nextInt();
		for(int i=1; i<10; i++)
		{
			System.out.println(a*i);
		}

	
//		for(int j =2; j<10; j++)
//		{
//			for(int k=1; k<10; k++){
//				
//				System.out.println(j+"x"+k+"=");
//			}
//		}
//		
		
	}
	/*
	 * 
	 * *****
	 * *****
	 * *****
	 * *****
	 */
	public void method13()
	{
		
		for (int i =1; i <6; i++)
		{	System.out.print("\n");
			for(int j = 0; j<6; j++) {
				System.out.print("*");
			}
			
		
		}
		
	}
	/*
	 * 1*** i=0 j=0
	 * *2** i=1 j=1
	 * **3* i=2 j=2
	 * ***4 i=3 j=3
	 */
	public void method14() {
		
		for (int i =0; i<4; i++)
		{
			for(int j=0; j<4; j++) {
				if(i==j) {
					System.out.print(i+1);
				}else {
					System.out.print("*");
				}
			
			}
		}
		System.out.println();
		
	}
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
	public void method15() {
		
		for(int i =1; i<=5; i++){
			
			for(int j=1; j<=i; j++)
			{	
				System.out.print("*");
				if(i==j)System.out.print("\n");
			}
			
		}
		
		
	}
	/*     *
	 *    **
	 *   ***
	 *  ****
	 * *****   i =1 j =5
	 * 		i=2 j=4
	 * 		i=3 j=3
	 * 		i =4 j=2
	 * 		i =5 j=1
	 */
	public void method16() {
		for(int i =1 ; i<=5; i++) {
			for(int j =5; j>=1; j--) {
				
				if(i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
							
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
		//c.method13();
		//c.method14();
//		c.method15();
		c.method16();
	}

}

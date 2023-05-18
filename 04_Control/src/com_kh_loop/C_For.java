package com_kh_loop;

import java.util.Scanner;

public class C_For {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * for 문
	 * [표기법]
	 * 
	 * for (초기식; 조건식; 증강식) {
	 * 		...실행 코드...
	 * }
	 * 
	 * - 주어진 횟수 만큼 코드를 반복 실행하는 구문
	 * - 초기식은 반복문이 수행될 떄 단 한번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문(for)를 빠져나간다.
	 * - 증강식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 */
	public void method1() {
		
		for(int i=0; i<5; i++)
		{
			System.out.println(i+1);
		}
		
	}
	
	public void method2() {
		for(int i=5; i>=1; i--)
		{
			System.out.println(i);
		}
		
	}
	public void method3() {
		for(int i=1; i<10; i+=2)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
		c.method3();
		
	}

}

package com.kh.operator;
import java.util.Scanner;
public class D_Comparison {
		/* 
		 * 비교 연산자
		 * a < b : a가 b보다 작은 가?
		 * a > b : a가 b보다 큰 가?
		 * a <= b : a가 b보다 작거나 같은가?
		 * a >= b : a가 b보다 크거가 같은가?
		 * a == b: a가 b랑 같은가?
		 * a != b : a가 b랑 틀린가?
		 * 
		 * - 비교 연산의 조건을 만족하면 true 만족하지 않으면 false를 반환한다.
		 */
	public static void main(String[ ]args) {
		
		D_Comparison d = new D_Comparison();
		
//		d.method1();
		d.method2();
	}
	
	
	public void method1() {
		
		int a = 10 ;
		int b = 25 ;
		
		
		
		System.out.println("a랑 b가 같은가 ? : "+ (a==b));
		
		System.out.println("a<=b: "+(a<=b));
		
		boolean result = (a>b);
		
		System.out.println("result : " + result);
		
		//산술 연산 + 비교연산
		System.out.println((a*2)>(b/5));
		
		System.out.println("a가 짝수인가 : "+(a%2==0));

		System.out.println("a가 홀수인가 : "+(a%2!=0));// !(a % 2==0)
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수:");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");		
		int num2 =sc.nextInt();
		
		System.out.print("첫 번째가 두번째보다 큽니까? :"+ (num1 > num2));
		System.out.print("첫번째 정수가 짝수입니까?"+(num1==0));
		//문자와 숫자간의 대소비교가능
		System.out.println(num2>'A');
		//'A'~'Z' : 65~99 까지의 숫자로 연달아 나열되어있음.
	
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}
}

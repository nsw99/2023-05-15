package com.kh.operator;

public class C_Arithmetic {

	/*
	 *  산술 연산자
	 *  
	 *  +(더하기)
	 *  -(뺴기)
	 *
	 *  *(곱하기)
	 *  /(나누기)
	 *  %(나머지)
	 * 
	 */
	
	
	
	public static void main(String [] args) {
		C_Arithmetic c = new C_Arithmetic();
		
		//c.method1();
		c.method2();
		
		
	}
	
	public void method1()
	{
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : "+ (num1+num2));
		System.out.println("num1 - num2 : "+ (num1 - num2));
		System.out.println("num1 * num2 : "+ (num1*num2));
		System.out.println("num1 / num2 : "+ (num1 / num2));
		System.out.println("num1 % num2 :"+ (num1%num2));
		
	}
	
	public void method2()
	
	{
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a; 
		int e = c%a; 
		int f = e++;
		int g = (--b) + (d--);
		int h  = 2 ;
		int i = (a++)+b/(--c/f)*(g-- - d)%(++e + h);
			 	// (6)+9/(15/4)*(11 - 1)%(6+2)
		System.out.println("i:"+i);
		
		
		
	}
}

package Com.kh.Practice;

import java.util.Scanner;

public class VariablePractice {
	

	
	public static void main(String[] args) {
		
		VariablePractice a = new VariablePractice();
		
		//a.method1();
		//a.method2();
		//a.method3();
		a.method4();
	}
	public void method1()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 :");
		int a = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 :");
		int b = sc.nextInt();
		
		System.out.printf("더하기 결과: %d\n빼기 결과 : %d\n곱하기 결과 : %d\n나누기몫 결과 : %d\n", a+b , a-b, a*b, a/b);
		
	}
	
	public void method2()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("성인이 몇명인가요? ");
		int a = sc1.nextInt();
		System.out.print("성인"+a+"명\n");
		System.out.print("청소년이 몇명인가요? ");
		int a2 = sc1.nextInt();
		System.out.print("청소년"+a2+"명\n");
		
		System.out.printf("성인 %d명 : %d \n청소년 %d명: %d \n총 금액 : %d",a,a*10000,a2,a2*7000,(a*10000)+(a2*7000));
		
		
		
	}
	
	
	public void method3()
	{
		int x = 5;
		int y = 7;
		int z = 9;
		
		x = y;
		y = z;
		z = x - 2;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
	}
	
	public void method4() {
		Scanner sc3  = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String a = sc3.nextLine();
		char b = a.charAt(0);
		char c = a.charAt(7);
		System.out.println("첫번째 문자 :"+b);
		System.out.println("마지막 문자:"+c);

		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
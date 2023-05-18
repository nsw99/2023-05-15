package operatorPractice;

import java.util.Scanner;

public class Pratice01 {
	
	public static void main(String []args)
	
	{
		Pratice01 a = new Pratice01();
		
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		//a.method5();
		a.method6();
	}	
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d=0;
		System.out.print("인원수 :");
		
		a = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		
		b = sc.nextInt();
		
		c = b/a;
		d = b%a;
		
		System.out.println("1인당 연필 개수 : "+c+"\n"+"남는 연필 개수 : "+d);
		
		
	}
	
	public void method2() {
		Scanner sc1 = new Scanner(System.in);
		
		int a ,b= 0;
		
		System.out.print("양수를 입력해주세여 : ");
		
		a = sc1.nextInt();
		
		b= a%100;
		System.out.printf("%d", a-b);
			
			
			
	
	}
	
	
	
	public void method3()
	{
		
		Scanner sc2 = new Scanner(System.in);
		
		int a , b ,c =0;
		String d = "";
		
		System.out.println("3개의 수를 입력해주세요");
		
		a = sc2.nextInt();
		b = sc2.nextInt();
		c = sc2.nextInt();

		d = (a==b&&b==c&&a==c) ? "true" : "false";
		
		System.out.println(d);
		
		
		
	
		
	}
	public void method4()
	
	{
		
		Scanner sc3= new Scanner(System.in);
		
		int a= 0;
		
		String f = "";
		
		System.out.print("정수를 입력해주세요 : ");
		
		a = sc3.nextInt();
		
		f = (a%2==0) ? "true" : "false";
		
		System.out.println(f);
		
		
		
	}
	
	
	
	public void method5() {
		Scanner sc4 = new Scanner(System.in);
		
		int a=0;
		String s = "";
		System.out.print("나이를 입력해 주세요:");
		
		a = sc4.nextInt();
		
		s = (a<=13) ? "어린이 입니다." : (a>13)&&(a<19) ? "청소년 입니다." : "성인입니다.";
		
		System.out.println(s);
		
		
	}
	
	
	public void method6()
	{
		Scanner sc5 = new Scanner(System.in);
		
		int a , b ,c = 0 ;
		
		System.out.print("사과의 개수:");
		
		a = sc5.nextInt();
		
		System.out.print("바구니의 크기:");

		
		b= sc5.nextInt();
		
		c = (a+b)/b;
		
		System.out.println("필요한 바구니 수 : "+c);
		
		
	} 
	
}

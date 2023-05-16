package Com.kh.Practice;

import java.util.Scanner;
public class CastingPractice {

	public static void main(String[] args) {
		CastingPractice a = new CastingPractice();
		
		a.method1();

	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 :");
		String a = sc.nextLine();
		char b= a.charAt(1);
		
		System.out.println(b);
		
		
		
	}

}

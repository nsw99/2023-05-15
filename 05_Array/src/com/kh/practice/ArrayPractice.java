package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 */
	public void method1() {
		String a[] = { "사과", "수박", "복숭아", "딸기", "샤인머스켓" };

		for (int i = 0; i < 1; i++) {
			System.out.println((a[i]));
		}

	}

	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된
	 * 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 배열 2번째 인덱스에 넣을 값 : 3 배열 3번째
	 * 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 [4, -4, 3, -3, 2] 2
	 */
	public void method2() {

		int a = 0;
		int b = 0;
		int c = 0;
		int sum=0;
		System.out.println("정수 :");
		a = sc.nextInt();
		int arr[] = new int[a];
		while (true) {

			System.out.println("배열" + b + "번째 인득스에 넣을 값 : ");
			arr[b] = sc.nextInt();
			sum += arr[b];
			b++;
			
			
			if (a == b) {
				System.out.println(Arrays.toString(arr));
				System.out.println(sum);
				break;
			}
			
						
			
		}
	}


	

	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을
	 * 출력하세요.
	 * 
	 */
	public void method3() {
		String  s = "";
		String [] s1= {"피자","치킨","햄버거"};
		int b = 0;
		
//		System.out.println(Arrays.toString(s));
		
		while(true) {
			System.out.println("음식을 입력해주세요 : ");
			s = sc.nextLine();
		if(s.equals(s1[0])) {
			System.out.println("배달 가능");
			break;
		}
		else if(s.equals(s1[1])) {
			System.out.println("배달 가능");
			break;
		}
		else if(s.equals(s1[2])) {
				System.out.println("배달 가능");
				break;
		}
			
		else {
			System.out.println("배달 불가능");
			
		}
		}
		
	}

	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
	 * 
	 * 주민등록번호 : 123456-1234567 123456-1******
	 * 
	 */
	public void method4() {
		
		
		int a = 0;
		System.out.println("주민 번호를 입력해주세요 :");
		a = sc.nextInt();
		int arr[] = {a};
		System.out.println(Arrays.toString(arr));
		
		

	}

	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
	 * 
	 * 단어 입력 : programming gnimmargorp
	 * 
	 */
	public void method5() {

	}

	public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//		a.method1();
//		a.method2();
//		a.method3();
		a.method4();
	}

}

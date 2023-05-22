package com_kh_loop;

import java.util.Scanner;

class LoopPractice {
	Scanner sc = new Scanner(System.in);

	/*
	 * 사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오. 사용자 입력 : 5 5 4 3 2 1
	 */
	public void method1() {
		int a = 0;
		System.out.print("1~100사이의 숫자를 입력해주세요 : ");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) { // 여기를 거꾸로~~! 증감 연산자에서 -- 활용해본다고 생각하고 다시 시도 해보면 좋을 것 같아요! 

			System.out.println(i);

		}

	}

	// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() { 
		
		//뭐가 잘못된지 모르겠어요 -> 오? 잘하셨는데요!! 조건식을 for문에 넣어서 해도 되는거 맞아요! 딱 100이상 되었을 때 break! 다 잘하셨음!!
		int sum = 0;
		for (int i = 1;; i++) {
			int num = (i % 2 == 0) ? -i : i;
			sum += num;
			if (sum >= 100) {
				System.out.println(i);
				break;
			}

		}

	}

	/*
	 * 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요.
	 * 
	 * 문자열 : banana 문자 : a banana 안에 포함된 a 개수 : 3
	 * 
	 */
	public void method3() {
		String s, s1 = "";
		System.out.print("문자열 : ");
		s = sc.nextLine();
		System.out.println("문자 : ");
		s1 = sc.nextLine();

		int a = (char) s1.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char d = s1.charAt(0);
			if (c == d) {
				a++;
			} else {
				System.out.println("");
			}

		}
		System.out.println(s + "안에 포함된" + s1 + "의 개수는" + a);

	}

	/*
	 * 0이 나올 때까지 숫자를 출력하시오. (random 사용!) 7 3 4 2 3 4 0
	 */
	public void method4() {

		int random = (int) (Math.random() * 10); // 여기 이렇게 되면 0~9까지만이에요 0~10까지 10도 나올 수 있도록 해볼까요?
		for (int i = 0; i <= random; i++) {

			if (random == 0)
				continue;
			System.out.println(i);

		}

	}

	/*
	 * 주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
	 * 
	 * 1 : 3 2 : 2 3 : 1 4 : 0 5 : 4 6 : 0
	 * 
	 */
	public void method5() { // 너무 길게한거 같은데 다른방법은 없나요ㅜㅜ -> if문 사용이 거북하다면 switch문도 추천드려요!
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		for (int i = 1; i < 11; i++) {
			int random = (int) (Math.random() * 6 + 1); // 여기는 이렇게 하셨는데! 여기 힌트 얻어서 위에 문제 random 범위 지정해주세요!
			if (random == 1) {

				a++;
			} else if (random == 2) {

				b++;
			} else if (random == 3) {

				c++;
			} else if (random == 4) {

				d++;
			} else if (random == 5) {

				e++;
			} else if (random == 6) {

				f++;

			}

		}
		System.out.println(" 1: " + a + " 2:" + b + " 3: " + c + " 4: " + d + " 5: " + e + " 6: " + f);
	}

	/*
	 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
	 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요. ​
	 * 당신의 이름을 입력해주세요 : 가위바위보 : 가위 컴퓨터 : 가위 박신우 : 가위 비겼습니다. ​ 가위바위보 : 가위 컴퓨터 : 바위
	 * 박신우 : 가위 졌습니다 ㅠㅠ ​ 가위바위보 : 보 컴퓨터 : 바위 박신우 : 보 이겼습니다 !
	 */
	public void method6() {

		int user = 0;
		String s, s1 = "";
		System.out.println("당신의 이름을 입력해주세요 : ");
		s = sc.nextLine();
		System.out.println("가위 바위 보! : ");
		s1 = sc.nextLine();

		if (s1.equals("가위")) {
			user = 1;
		} else if (s1.equals("바위")) {
			user = 2;
		} else {
			user = 3;
		}

		while (true) {

			int c = ((int) (Math.random() * 3) + 1);

			if (c == 1) {
				System.out.println("컴퓨터 : " + "가위");
			} else if (c == 2) {
				System.out.println("컴퓨터 : " + "바위");
			} else if (c == 3)
				System.out.println("컴퓨터 : " + "보");

			if (user == 1 && c == 2 || user == 2 && c == 3 || user == 3 && c == 1) {
				int count1 = 1;    // ---> 여기가 다시 반복문이 돌면서 1이 되고 있어요~~
				System.out.println(s + ":" + user);
				System.out.println("컴퓨터" + ":" + c); // 가위 바위 보로 표현 하는 방법을 모르겠어요 ㅜㅜ -> 각 숫자를 switch문을 사용해서 매치해보면 돼요!! 할 수 있어요~~
				System.out.println(count1 + "번 졌습니다"); // count1 이 증가가 안하는데 왜그런건가요? -> count1도 반복문에 들어가 있어서 그렇습니다 :)
				count1++;

			} else if (user == 1 && c == 3 || user == 2 && c == 1 || user == 3 && c == 2) {
				int count2 = 1;
				System.out.println(s + ":" + user);
				System.out.println("컴퓨터" + ":" + c); // 가위 바위 보로 표현 하는 방법을 모르겠어요 ㅜㅜ
				System.out.println(count2 + "번 이겼습니다");
				count2++;
				break;
			}

			else {
				int count3 = 1;

				System.out.println(c);
				System.out.println(count3 + "번 비겼습니다");
				count3++;
			}

		}

	}

	public static void main(String args[]) {
		LoopPractice w = new LoopPractice();
//    	w.method1();
//		w.method2();
//		w.method3();
//		w.method4();
		w.method5();
		w.method6();

	}

}
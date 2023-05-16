package Com.kh.variable;

import java.util.Scanner;


public class D_Keyboardinput {

	/*
	 *	Scanner
	 * -화면(console)으로부터 데이터를 입력받는클래스
	 * 
	 *  1) import java.utill.Scanner; 추가
	 *  
	 *  2) Scanner 클래스 생성
	 *  	Scanner sc = new Scanner(System.in);
	 *  
	 *  3) Scanner 클래스 사용
	 *  	입력 값이 
	 *  		-문자열일 때 : sc.next() - 공백이 있을 경우 공백 이전까지 
	 *  					sc.nextline() - 공백 포함 엔터 전까지(권장)
	 *  		
	 *  		-정수일 때 : sc.nextInt()
	 *  		
	 *  		-실수일 때 : sc.nextDouble() sc.nextFloat()
	 *  		
	 *  
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? >");
		String name = sc.next();
		sc.nextLine();
	
		System.out.print("당신의 집은 어디십니까? >");
		String addr =sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까? >");
		
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까?(소수점 첫째 짜리까지 입력하세요.) >");
		float height = sc.nextFloat();
		sc.nextLine(); // nextLine이 뒤에 나올때마다 앞에다 적기
		
		System.out.print("당신의 성별은 무엇입니까?(남/여) >");
		String line = sc.nextLine(); 
		char gender = line.charAt(0);
		
	
		System.out.println("당신의 이름은 "+name+" 이고 사는곳은"+addr+", 나이는"+ age + "키는"+height+ "성별은 " + gender+"입니다");
		
		
		//System.out.printf("당신의 이름은 %s 이고 사는곳은 %s 나이는 %d 키는 %.1f 성별은 %s 입니다\n",name,addr,age,height,gender); 
		
		
		

	}

}

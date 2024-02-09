package day8;

import java.util.Scanner;

public class JEswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("신호등 ");
		System.out.println("신호를 입력 : ");
		System.out.println("빨간불:1 , 노란불:2 , 초록불: 3 ");
		int sign = scan.nextInt();
		switch (sign) {
		case 1: 
			System.out.println("발간불입니다. 정지하세요");
		break;
		case 2: 
			System.out.println("노란불입니다.break밟으세요");
		break;
		case 3: 
			System.out.println("초록불입니다.출발하세요");
		break;
		default:
			System.out.println("잘못누르셨습니다");
		}
	}

}

class Switch {

	public static void main(String[] args) {
		//일년동안 읽은 책 수에 따라 멘트를 출력
		int book=2;
		book=book/10;
		switch(book) {
		case 0 :
			System.out.println("조금 더 노력하세요");
			break;
		case 1 :
			System.out.println("책 읽는 것을 즐기시는 분이시네요");
			break;
		case 2 :
			System.out.println("책을 사랑하시는 분이시네요");
			break;
		default:
			System.out.println("당신은 다독왕입니다!");
		}
	}
}

class Switchnobreak {

	public static void main(String[] args) {
		//일년동안 읽은 책 수에 따라 멘트를 출력
		int book=10;
		book=book/10;
		switch(book) {
		case 0 :
			System.out.println("조금 더 노력하세요");
		case 1 :
			System.out.println("책 읽는 것을 즐기시는 분이시네요");
		case 2 :
			System.out.println("책을 사랑하시는 분이시네요");
		default:
			System.out.println("당신은 다독왕입니다!");
		}
	}
}
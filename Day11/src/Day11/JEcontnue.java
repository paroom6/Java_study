package Day11;

import java.util.Scanner;

public class JEcontnue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int s =0;
		while(true) {
			System.out.println("숫자입력: ");
			n=sc.nextInt();
			if(n==0) {
				System.out.println("end");
				break;
			}else if(n<0) {
				System.out.println("양수만 입력하세요");
				continue;
			}
			s = s+n; 
		}
		System.out.println("총합: "+ s);
	}

}
class JEmoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10000;
		System.out.println("잔액은 10000원입니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("얼마를 사용하겠습니까?");
			int i =sc.nextInt();
			if(!(0<=i &&i<=m)) {
				System.out.println("잔액이 부족합니다");
			    continue;
			}
			System.out.printf("이제 %d원 남았습니다.\n",m-=i);
			if(m==0) {
				break;
			}
		}
		System.out.println("잔액이 없습니다.");
}	
}
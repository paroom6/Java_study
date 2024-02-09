package Day11;

import java.util.Scanner;

public class JE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		while(true) {
			System.out.println("숫자를 압력");
			i = sc.nextInt();
			if(i==0) {
				System.out.println("end");
				break;
				
			}
			
		System.out.println(i);
	}
	}

}
class JEbreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,s=0;
		while(true) {
			System.out.println("더할 숫자를 입력(0은 종료)");
			i=sc.nextInt();
			if(i==0) {
				break;
			}
			s=s+i;
		
		}
		System.out.println("총합"+s);
	}
}
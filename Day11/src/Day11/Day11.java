package Day11;

import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if(i%2 != 0) {
				continue;
			}
			sum = sum + i;

		}
		System.out.println(sum);
	}

}

class DAy11break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		while(true) {
			int val = (int)(Math.random()*50+1);
			if(val == 30) {
				System.out.println("종료");
				break;
			}
			a += val ;
			System.out.println(val + ", ");
		}
		System.out.println();
		System.out.println(a);

	}
}


class DAy11UPdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  t = (int)(Math.random()*50+1);
		Scanner scan = new Scanner(System.in);
		
		int c = 0;
		int u = 0;
		for(;;) {
			System.out.println("숫자를 입력: ");
			u = scan.nextInt();
			if(t==u) {
				System.out.println("정답 숫자는" + u +"입니다."+c+"번 만에 맞추었습니다");
				break;
			}else if(t>u) {
				System.out.println("up");
			}else if(t<u) {
				System.out.println("down");
			}
			c++;
		}scan.close();
		
		}
	}

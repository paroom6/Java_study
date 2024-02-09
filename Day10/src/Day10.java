import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		int c = 1;
		
		while(c<=10) {
			s = s + c;
			//카운트증가
			c++;
		
		}
		System.out.println(s);

	}

}


class Updown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = (int)(Math.random()*50)+1;
		Scanner scan = new Scanner(System.in);
		int u = 0;
		int c = 1;
		while(t !=u) {
			System.out.println("숫자를 입력 : ");
			u = scan.nextInt();
			if(t>u) {
				System.out.println("up");
			}else if(t<u) {
				System.out.println("down");
			}else {
				System.out.println("정답 값은"+ t+"입니다");
				System.out.println(c + " 번만에 맞췄습니다");
			}
			c++;
		}
		scan.close();
		
		}
		
	}


class Do {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		while(c<1) {
			System.out.println("실행");
		
		}
		do {
			System.out.println("do while");
			
		}while(c<1);
	}
}


 class Dowhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		int s = 0;
		do {
			s+=c++;
		}while(c<=10);
		System.out.println(s);
		}
		
	}

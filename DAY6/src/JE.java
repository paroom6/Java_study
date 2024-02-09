import java.util.Scanner;

public class JE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 17;
		System.out.println(a>19? "성인입니다":"청소년입니다");
		
	}
}
class JE2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("신호등 ");
		System.out.println("신호를 입력 : ");
		System.out.println("빨간불:1 , 초록불:2 ");
		int s = scan.nextInt();
		String result=s==1?"정지하세요": s==2?"출발하세요": "보류";
		System.out.println(result);
		scan.close();
		
		}
	}
class JE3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 5;
		x=y;
		System.out.println(y);
		
				
	}
}

class JE4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		int n = 3;
		System.out.println("hello"instanceof String);
		System.out.println(Integer.valueOf(n) instanceof Integer);
		
		
		
				
	}
}
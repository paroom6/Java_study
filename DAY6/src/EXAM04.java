import java.util.Scanner;

public class EXAM04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 50;
		
		if(s >= 60) {
			System.out.println("합격");
//			참일때
		}else {
			System.out.println("불합격");
//		거짓일때
		}
		

	}

}

class EXAM02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력 : ");
		int age = scan.nextInt();
		if(age>19) { 
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
			}
		scan.close();
		
		}
}
	
class EXAM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 : ");
		int score = scan.nextInt();
		if(score>=90) { 
			System.out.println('A');
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
	System.out.println("C");
		}else {
			System.out.println('F');
		}
	
		scan.close();
		
		}
	}
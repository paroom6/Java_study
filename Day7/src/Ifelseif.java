import java.util.Scanner;

public class Ifelseif {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이: ");
		age=sc.nextInt();
		
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}else if(age>13) {
			System.out.println("청소년입니다");
			System.out.println("청소년요금이 적용됩니다.");
		}else if (age>8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이요금이 적용됩니다.");
		}else {
			System.out.println("유아입니다.");
			System.out.println("유아요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해주세요");
	}
}
class If_if {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id,password;
		Scanner input = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		id=input.nextLine();//nextline-띄어쓰기까지 입력받기
		
		if(id.equals("java")) {
			System.out.println("id 일치!");
			System.out.println("비밀번호를 입력해주세요.");
			password=input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("password 일치!");
				System.out.println("로그인 성공!");
			}else {
				System.out.println("password 불일치");
			}
		}else {
			System.out.println("id불일치");
		}
	}
}
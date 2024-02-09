package day02;
import java.util.Scanner;//입력기능을 코드에 연결시킨다
public class Day02input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		문자열로 입력
		System.out.println(sc.next());		
		//sc.nextInt() 정수값으로 입력
		System.out.println(sc.nextInt());
//sc.nectFloat 실수값으로 입력
		System.out.println(sc.nextFloat());
//	sc.nextLine 뛰어쓰기까지 포함해서 문자열로 입력
		System.out.println(sc.nextLine());
	}

}

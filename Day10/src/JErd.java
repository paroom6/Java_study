	import java.util.Random;
	import java.util.Scanner;
	
public class JErd {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			int user =-1;
			int rnum = random.nextInt(100)+1;
			while(rnum!=user) {
				System.out.println("숫자 입력:");
				user = sc.nextInt();
				if(rnum<user) {
					System.out.println("down");
				}
				else if(rnum>user) {
					System.out.println("up");
				}
				else {
					System.out.println("정답");
				}					
			}
	} 
	}


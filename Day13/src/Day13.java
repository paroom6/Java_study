import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Day13 {

		public static void main(String[] args) {
			int[] lotto = new int [45];
			int[] balls = new int [6];
			int bonus = 0;
			for(int i = 0; i<lotto.length; i++) {
				lotto[i] = i+1;
			}
			int count =0;
			while(count<7) {
				int index =(int)(Math.random()*45);
				//선택된 index 값이 0이 아니면 미사용 0이면 사용
			if(lotto[index]!=0) {
				if(count<6) {
					balls[count++] = lotto[index];
				}else {
					bonus = lotto[index];
					count++;
				}
				lotto[index]=0;
			}
			}
			for(int i = 0; i<balls.length; i++) {
				System.out.print(balls[i]+" ");
			}
			System.out.println("보너스 번호: " + bonus);
			count=0;
			Scanner sc = new Scanner(System.in);
			int[]u= new int[6];
			while (count<6) {
				System.out.println((count+1)+ "번째 로또 번호 : " );
				int ball = sc.nextInt();
				for(int i = 0; i<count; i++) {
					if(u[i]==ball) {
						System.out.println(ball+"는 존재합니다");
						ball=0;
						break;
					}
				}
					if(ball !=0) {
						u[count++]=ball;
					}
			}
					sc.close();
			
				
				System.out.println("사용자 번호: ");
				for(int i = 0; i<balls.length; i++) {
					System.out.print(u[i]+" ");
			}
			System.out.println();
		int match=0;
		boolean is=false;
		for(int i =0; i< u.length; i++) {
			for(int j=0; j<balls.length; j++) {
				if(u[i]==balls[j]) {
					match++;
					break;
				}
			}
			if(!is) {
				if(u[i]==bonus) {
					is=true;
				}
			}
		}
			if(match==6) {
				System.out.println("1등");
			}else if(match==5 && is) {
				System.out.println("2등");
			}else if(match==5 ) {
				System.out.println("3등");
			}else if(match==4) {
				System.out.println("4등");
			}else if(match==3) {
				System.out.println("5등");
			}
			
	}
			
}
			

			
	
			
		

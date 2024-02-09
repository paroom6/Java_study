
	import java.util.Scanner;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Random;
	
public class JElotto {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Random random = new Random();

				int[] lotto = new int [6];
				int[] u = new int[6];
				int bonus,ubonus = 0;
				int count =0;
				for(int i =0; i<6; i++) {
				  lotto[i]= random.nextInt(45)+1;
				}
				bonus=random.nextInt(45)+1;
				System.out.println("lottos:" + Arrays.toString(lotto)+"bonus: "+bonus );
				System.out.println("6개의 숫자 입력:");
				for(int i =0; i<6; i++) {
					  u[i]= sc.nextInt();
					}
				System.out.println( "보너스 번호 : " );
				ubonus = sc.nextInt();
				System.out.println("user:" + Arrays.toString(u)+"bonus: "+ubonus );

				for(int i =0; i<6;i++) {
					for(int j=0; j<6; j++) {
						if(u[i]==lotto[j]) {
							count++;
						}
					}
				}
				System.out.println(count+"개 맞추었습니다");
				if(count==6) {
					System.out.println("1등");
				}else if(count==5) {
					if(bonus==ubonus)
					System.out.println("2등");
				}
				else if(count==5 ) {
					System.out.println("3등");
				}else if(count==4) {
					System.out.println("4등");
				}else if(count==3) {
					System.out.println("5등");
				}else System.out.println("낙첨되었습니다");
				
				
		}
				
	}
				

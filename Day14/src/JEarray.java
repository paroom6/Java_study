import java.util.Scanner;

public class JEarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = new int[5];
		int ar2[] = new int[5];
		
		int array[][] = new int[2][5];
		
	}

}

class JEar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int[4][3];		
		String subject[] = {"국어","영어","수학"};
		for(int i=0;  i<4; i++) {
			System.out.println((i+1)+"번 학생 점수-----");
			for(int j=0; j<3; j++) {				
				System.out.print(subject[j]+": ");
				scores[i][j] = sc.nextInt();		
				}
			
		}
		for(int i=0; i<3; i++) {
			System.out.print("\t"+subject[i]);
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			System.out.print((i+1)+"번:\t");
			for(int j=0; j<3; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();

		}
		
	}
}
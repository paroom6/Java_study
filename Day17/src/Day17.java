import java.util.Arrays;
import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] std = new int[3][3]; 
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<std.length; i++) {
			System.out.println((i+1)+"번 학생 국어점수: ");
			std[i][0] = sc.nextInt();
			System.out.println((i+1)+"번 학생 영어점수: ");
			std[i][1] = sc.nextInt();
			System.out.println((i+1)+"번 학생 수학점수: ");
			std[i][2] = sc.nextInt();
		}
		for(int i =0; i<std.length; i++) {
			System.out.println((i+1)+"번 학생: "+ Arrays.toString(std[i]));
		}
		sc.close();
		
		int max= 0;
		int sum =0;
		int maxsum=0;
		for(int i=0; i<std.length; i++) {
			sum=0;
			for(int j=0; j<std.length; j++) {
				sum +=std[i][j];
			}
			if(maxsum<sum) {
				maxsum=sum;
				max=i;
			}
		}
		System.out.println("성적 최우수자: "+ (max+1)+"번 학생: "+ Arrays.toString(std[max])+"총점: "+maxsum);

	}

}
class Day {

	public static void main(String[] args) {
		
		int[][] m = new int[5][5];
		int row =0;
		int col =2;
		m[row][col]=1;
		for(int i=2;i<=25;i++) {
			row--;
			col++;
			if(row<0 && col<5) {
				row = 4;
				
			}
			else if(row>=0 && col==5) {
				col=0;
			}
			else if(row<0 && col==5) {
				row+=2;
				col--;
			}
			if(m[row][col] !=0) {
				row+=2;
				col--;
			}
			m[row][col]=i;
		}
		for(int i=0; i<m.length; i++) {
		System.out.println(Arrays.toString(m[i]));
		}
	}

}